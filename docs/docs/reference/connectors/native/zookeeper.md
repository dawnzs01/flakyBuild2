---
title: Apache Zookeeper
---

<img src="/assets/plugin/zookeeper.png" class="connector-logo" />

#### What is Zookeeper ?

ZooKeeper is a centralized service for maintaining configuration information, naming, providing distributed synchronization, and providing group services. All of these kinds of services are used in some form or another by distributed applications. Each time they are implemented there is a lot of work that goes into fixing the bugs and race conditions that are inevitable. 

#### Environment

---

!!! note

    If you need to use this data source, you need to upgrade the DataCap service to >= `1.5.x`

Support Time: `2023-02-07`

#### SQL statement syntax

---

This chapter describes the SQL syntax used in Zookeeper on DataCap.

##### SELECT

!!! note "Synopsis"

```sql
SELECT [ * | <Columns> ] select_expression [, ...]
FROM from_item [. ...]
```

where `from_item` is one of

```sql
table_name [ `a.b` | a.b | `a`.`b`]
```

!!! danger

    When `table_name` is set to `all` the root directory is searched.

!!! note "Select expressions"

Each `select_expression` must be in one of the following forms:

```sql
expression [ column_alias ]
```

```sql
*
```

In the case of `expression [ column_alias ]`, a single output column is defined.

In the case of `*`, all columns of the relation defined by the query are included in the result set.

```sql
    *
--------
   data
```

!!! danger
 
    If it is a multi-level directory, such as `/zookeeper/id/2`, it will be written **\`zookeeper\`.\`id\`.\`2\`**, and use `.` to split between directories.

#### Configure

---

DataCap uses configuration files by default [zookeeper.json](https://github.com/EdurtIO/datacap/blob/dev/server/src/main/etc/conf/plugins/native/zookeeper.json)

!!! note

    If your Zookeeper service version requires other special configurations, please refer to modifying the configuration file and restarting the DataCap service.

=== "Configure"

    | Field  |             Required              | Default Value |
    |:------:|:---------------------------------:|:-------------:|
    | `Name` | :material-check-circle: { .red }  |       -       |
    | `Host` | :material-check-circle:  { .red } |  `127.0.0.1:2181`  |
    | `Port` | :material-close-circle:           |    `1`     |

#### Version (Validation)

---

!!! warning

    The online service has not been tested yet, if you have detailed test results, please submit [issues](https://github.com/EdurtIO/datacap/issues/new/choose) to us

- [x] `3.1.x` - `3.7.x`
