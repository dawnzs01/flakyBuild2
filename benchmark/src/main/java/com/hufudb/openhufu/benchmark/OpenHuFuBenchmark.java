package com.hufudb.openhufu.benchmark;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.hufudb.openhufu.core.table.GlobalTableConfig;
import com.hufudb.openhufu.user.OpenHuFuUser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Query benchmark: Require that all data owners have been started,
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
public class OpenHuFuBenchmark {

  private static final Logger LOG = LoggerFactory.getLogger(OpenHuFuBenchmark.class);
  private static final OpenHuFuUser user = new OpenHuFuUser();

  private static String configPath;

  public static void main(String[] args) throws RunnerException {
    org.apache.commons.cli.Options options = new org.apache.commons.cli.Options();
    Option cmdConfig = new Option("c", "config", true, "user config file path");
    cmdConfig.setRequired(true);
    options.addOption(cmdConfig);
    CommandLineParser parser = new DefaultParser();
    CommandLine cmd;
    try {
      cmd = parser.parse(options, args);
      configPath = cmd.getOptionValue("c");
    } catch (Exception e) { // NOSONAR
      LOG.error("Error when start user", e);
      System.exit(1);
    }
    Options opt = new OptionsBuilder()
        .include(OpenHuFuBenchmark.class.getSimpleName())
        .jvmArgs(configPath)
        .build();
    new Runner(opt).run();
  }

  @Setup
  public void setUp() throws IOException {
    LinkedTreeMap userConfigs = new Gson().fromJson(Files.newBufferedReader(
            Path.of(configPath)),
        LinkedTreeMap.class);
    List<String> endpoints = (List<String>) userConfigs.get("owners");
    List<GlobalTableConfig> globalTableConfigs =
        new Gson().fromJson(new Gson().toJson(userConfigs.get("tables")),
            new TypeToken<ArrayList<GlobalTableConfig>>() {
            }.getType());
    LOG.info("Init benchmark of OpenHuFu...");
    for (String endpoint : endpoints) {
      user.addOwner(endpoint, null);
    }

    for (GlobalTableConfig config : globalTableConfigs) {
      user.createOpenHuFuTable(config);
    }
    LOG.info("Init finish");
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testSelect() throws SQLException {
    String sql = "select * from nation";
    try (Statement stmt = user.createStatement()) {
      ResultSet it = stmt.executeQuery(sql);
      it.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testEqualJoin() throws SQLException {
    String sql = "select * from nation join region on nation.N_REGIONKEY = region.R_REGIONKEY";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testLeftJoin() throws SQLException {
    String sql = "select * from nation left join region on nation.N_REGIONKEY = region.R_REGIONKEY";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testRightJoin() throws SQLException {
    String sql =
        "select * from nation right join region on nation.N_REGIONKEY = region.R_REGIONKEY";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testFullJoin() throws SQLException {
    String sql = "select * from nation full join region on nation.N_REGIONKEY = region.R_REGIONKEY";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testCount() throws SQLException {
    String sql = "select count(*) from supplier";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

//  @Benchmark
//  @Fork(0)
//  @Warmup(iterations = 2)
//  @Measurement(iterations = 1)
//  public void testAvg() throws SQLException {
//    String sql = "select avg(P_PARTKEY) from part";
//    ResultSet dataSet = user.executeQuery(sql);
//    dataSet.close();
//  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testSum() throws SQLException {
    String sql = "select sum(P_PARTKEY) from part";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testMax() throws SQLException {
    String sql = "select max(C_CUSTKEY) from customer";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testMin() throws SQLException {
    String sql = "select min(C_CUSTKEY) from customer";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }

  @Benchmark
  @Fork(0)
  @Warmup(iterations = 2)
  @Measurement(iterations = 1)
  public void testGroupByAndOrder() throws SQLException {
    String sql = "select count(C_CUSTKEY) from customer group by C_CUSTKEY order by C_CUSTKEY DESC";
    try (Statement stmt = user.createStatement()) {
      ResultSet dataSet = stmt.executeQuery(sql);
      dataSet.close();
    }
  }
}



