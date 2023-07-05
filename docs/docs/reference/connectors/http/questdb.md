---
title: QuestDB
status: new
---

<img src="/assets/plugin/questdb.png" class="connector-logo" />

#### What is QuestDB ?

QuestDB is an open-source time-series database for high throughput ingestion and fast SQL queries with operational simplicity. It supports schema-agnostic ingestion using the InfluxDB line protocol, PostgreSQL wire protocol, and a REST API for bulk imports and exports.

#### Environment

!!! note

    If you need to use this data source, you need to upgrade the DataCap service to >= `1.9.x`

Support Time: `2023-04-17`

#### Configure

---

!!! note

    If your QuestDB service version requires other special configurations, please refer to modifying the configuration file and restarting the DataCap service.

=== "Configure"

    | Field  |             Required              | Default Value |
    |:------:|:---------------------------------:|:-------------:|
    | `Name` | :material-check-circle: { .red }  |       -       |
    | `Host` | :material-check-circle:  { .red } |  `127.0.0.1`  |
    | `Port` | :material-check-circle:  { .red } |    `9000`     |

#### Version (Validation)

---

!!! warning

    The online service has not been tested yet, if you have detailed test results, please submit [issues](https://github.com/EdurtIO/datacap/issues/new/choose) to us

- [x] 7.x
