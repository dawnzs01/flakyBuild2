package com.hufudb.openhufu.core.sql.schema;

import com.hufudb.openhufu.core.client.OpenHuFuClient;
import com.hufudb.openhufu.core.client.OwnerClient;
import com.hufudb.openhufu.core.sql.schema.OpenHuFuSchemaFactory.OwnerInfo;
import com.hufudb.openhufu.core.table.OpenHuFuTableSchema;
import com.hufudb.openhufu.core.sql.enumerator.OpenHuFuEnumerator;
import com.hufudb.openhufu.core.sql.rel.OpenHuFuTable;
import com.hufudb.openhufu.data.schema.Schema;
import com.hufudb.openhufu.data.storage.DataSet;
import com.hufudb.openhufu.plan.Plan;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.calcite.linq4j.AbstractEnumerable;
import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.linq4j.Enumerator;
import org.apache.calcite.linq4j.tree.Expression;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.schema.Schemas;
import org.apache.calcite.schema.Table;
import org.apache.calcite.schema.impl.AbstractSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.grpc.ChannelCredentials;
import io.grpc.TlsChannelCredentials;

/**
 * Schema manager of user side, integrated with Calcite
 */
public class OpenHuFuSchemaManager extends AbstractSchema {
  private static final Logger LOG = LoggerFactory.getLogger(OpenHuFuSchemaManager.class);

  private final SchemaPlus parentSchema;
  private final Map<String, Table> tableMap;
  private final Map<String, OwnerClient> ownerMap;
  private final OpenHuFuClient client;
  private final int userId;

  public OpenHuFuSchemaManager(List<Map<String, Object>> tables, SchemaPlus schema) {
    this.parentSchema = schema;
    this.tableMap = new ConcurrentHashMap<>();
    this.ownerMap = new ConcurrentHashMap<>();
    this.client = new OpenHuFuClient(this);
    this.userId = 0;
  }

  public OpenHuFuSchemaManager(List<OwnerInfo> owners, List<Map<String, Object>> tables, SchemaPlus schema, int userId) {
    this.parentSchema = schema;
    this.tableMap = new ConcurrentHashMap<>();
    this.ownerMap = new ConcurrentHashMap<>();
    this.client = new OpenHuFuClient(this);
    this.userId = userId;
    for (OwnerInfo owner : owners) {
      addOwner(owner.getEndpoint(), owner.getTrustCertPath());
    }
  }

  public OpenHuFuClient getClient() {
    return client;
  }

  public Set<String> getEndpoints() {
    return ownerMap.keySet();
  }

  public void addOwner(String endpoint, String trustCertPath) {
    try {
      ChannelCredentials cred = null;
      if (trustCertPath != null) {
        File trustCertFile = new File(trustCertPath);
        cred = TlsChannelCredentials.newBuilder().trustManager(trustCertFile).build();
      }
      addOwnerTLS(endpoint, cred);
    } catch (IOException e) {
      LOG.error("Fail to create channel credentials: {}", e.getMessage());
      addOwnerTLS(endpoint, null);
    }
  }

  public OwnerClient addOwnerTLS(String endpoint, ChannelCredentials cred) {
    if (hasOwner(endpoint)) {
      LOG.info("Owner at {} already exists", endpoint);
      return getOwnerClient(endpoint);
    }
    OwnerClient client = null;
    try {
      if (cred != null) {
        client = new OwnerClient(endpoint, cred);
      } else {
        client = new OwnerClient(endpoint);
      }
      if (client != null) {
        // establish connection among owners
        for (Map.Entry<String, OwnerClient> entry : ownerMap.entrySet()) {
          OwnerClient oldClient = entry.getValue();
          oldClient.addOwner(client.getParty());
          client.addOwner(oldClient.getParty());
        }
        ownerMap.put(endpoint, client);
      }
      LOG.info("Add owner {}", endpoint);
    } catch (Exception e) {
      LOG.warn("Fail to add owner {}", endpoint, e);
    }
    return client;
  }

  public OpenHuFuTableSchema getTableSchema(String tableName) {
    OpenHuFuTable table = (OpenHuFuTable) getTable(tableName);
    if (table == null) {
      LOG.warn("Table {} not exists", tableName);
      return null;
    }
    return ((OpenHuFuTable) getTable(tableName)).getTableSchema();
  }

  public List<OpenHuFuTableSchema> getAllOpenHuFuTableSchema() {
    List<OpenHuFuTableSchema> schemas = new ArrayList<>();
    for (Table table : tableMap.values()) {
      schemas.add(((OpenHuFuTable) table).getTableSchema());
    }
    return schemas;
  }

  public int getUserId() {
    return userId;
  }

  public boolean hasOwner(String endpoint) {
    return ownerMap.containsKey(endpoint);
  }

  public void removeOwner(String endpoint) {
    OwnerClient client = ownerMap.remove(endpoint);
    for (Table table : tableMap.values()) {
      OpenHuFuTable OpenHuFuTable = (OpenHuFuTable) table;
      OpenHuFuTable.getTableSchema().removeOwner(client);
      if (OpenHuFuTable.getTableSchema().localTableNumber() == 0) {
        dropTable(OpenHuFuTable.getTableName());
      }
    }
  }

  public void addTable(String tableName, Table table) {
    parentSchema.add(tableName, table);
    tableMap.put(tableName, table);
  }

  public void dropTable(String tableName) {
    tableMap.remove(tableName);
  }

  public boolean addLocalTable(String tableName, String endpoint, String localTableName) {
    OpenHuFuTableSchema table = getTableSchema(tableName);
    OwnerClient client = getOwnerClient(endpoint);
    if (table != null && client != null) {
      return table.addLocalTable(client, localTableName);
    }
    return false;
  }

  public void dropLocalTable(String tableName, String endpoint) {
    OpenHuFuTableSchema table = getTableSchema(tableName);
    OwnerClient client = getOwnerClient(endpoint);
    if (table != null && client != null) {
      table.dropLocalTable(client);
    }
  }

  public void dropLocalTable(String tableName, String endpoint, String localTableName) {
    OpenHuFuTableSchema table = getTableSchema(tableName);
    OwnerClient client = getOwnerClient(endpoint);
    if (table != null && client != null) {
      table.dropLocalTable(client, localTableName);
    }
  }

  public void changeLocalTable(String tableName, String endpoint, String localTableName) {
    OpenHuFuTableSchema table = getTableSchema(tableName);
    OwnerClient client = getOwnerClient(endpoint);
    if (table != null && client != null) {
      table.changeLocalTable(client, localTableName);
    }
  }

  @Override
  protected Map<String, Table> getTableMap() {
    return tableMap;
  }

  public boolean hasTable(String tableName) {
    return tableMap.containsKey(tableName);
  }

  public Schema getSchema(String tableName) {
    return getTableSchema(tableName).getSchema();
  }

  public OwnerClient getOwnerClient(String endpoint) {
    return ownerMap.get(endpoint);
  }

  public Expression getExpression() {
    return Schemas.unwrap(super.getExpression(parentSchema, "openhufu"), OpenHuFuSchemaManager.class);
  }

  public DataSet query(Plan plan) {
    return client.executeQueryPlan(plan);
  }

  @SuppressWarnings("unused")
  public Enumerable<Object> query(long planId) {
    return new AbstractEnumerable<Object>() {
      Enumerator<Object> enumerator;

      @Override
      public Enumerator<Object> enumerator() {
        if (enumerator == null) {
          this.enumerator = new OpenHuFuEnumerator(OpenHuFuSchemaManager.this, planId);

        } else {
          this.enumerator.reset();
        }
        return this.enumerator;
      }
    };
  }
}
