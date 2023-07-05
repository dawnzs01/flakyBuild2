---
title: ClickHouse
---

<img src="/assets/plugin/clickhouse.png" class="connector-logo" />

#### What is ClickHouse ?

ClickHouse® is a column-oriented database management system (DBMS) for online analytical processing of queries (OLAP). ClickHouse’s performance exceeds all other column-oriented database management systems. It processes billions of rows and tens of gigabytes of data per server per second.

#### Environment

!!! note

    If you need to use this data source, you need to upgrade the DataCap service to >= `1.0.x`

Support Time: `2022-09-22`

#### Configure

---

DataCap uses configuration files by default [clickhouse.json](https://github.com/EdurtIO/datacap/blob/develop/server/src/main/etc/conf/plugins/jdbc/clickhouse.json)

!!! note

    If your ClickHouse service version requires other special configurations, please refer to modifying the configuration file and restarting the DataCap service.

=== "Configure"

    | Field  |             Required              | Default Value |
    |:------:|:---------------------------------:|:-------------:|
    | `Name` | :material-check-circle: { .red }  |       -       |
    | `Host` | :material-check-circle:  { .red } |  `127.0.0.1`  |
    | `Port` | :material-check-circle:  { .red } |     `9000`    |

=== "Authorization"

    |   Field    |        Required         | Default Value |
    |:----------:|:-----------------------:|:-------------:|
    | `Username` | :material-close-circle: |       -       |
    | `Password` | :material-close-circle: |       -       |

=== "Advanced"

    |   Field    |        Required         | Default Value |
    |:----------:|:-----------------------:|:-------------:|
    | `Database` | :material-close-circle: |       -       |

=== "Custom"

    !!! note

        You can add the already supported ClickHouse parameters by adding Key Value, the parameters can be [reference document](https://clickhouse.com/docs/en/interfaces/jdbc)

#### Version (Validation)

---

!!! warning

    The online service has not been tested yet, if you have detailed test results, please submit [issues](https://github.com/EdurtIO/datacap/issues/new/choose) to us

- [x] 19.x
- [x] 20.x
- [x] 21.x
