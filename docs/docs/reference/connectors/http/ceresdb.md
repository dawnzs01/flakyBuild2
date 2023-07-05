---
title: CeresDB
status: new
---

<img src="/assets/plugin/ceresdb.png" class="connector-logo" />

#### What is CeresDB ?

CeresDB is a high-performance, distributed, cloud native time-series database.

#### Environment

!!! note

    If you need to use this data source, you need to upgrade the DataCap service to >= `1.9.x`

Support Time: `2023-04-12`

#### Configure

---

!!! note

    If your CeresDB service version requires other special configurations, please refer to modifying the configuration file and restarting the DataCap service.

=== "Configure"

    | Field  |             Required              | Default Value |
    |:------:|:---------------------------------:|:-------------:|
    | `Name` | :material-check-circle: { .red }  |       -       |
    | `Host` | :material-check-circle:  { .red } |  `127.0.0.1`  |
    | `Port` | :material-check-circle:  { .red } |    `5440`     |

#### Version (Validation)

---

!!! warning

    The online service has not been tested yet, if you have detailed test results, please submit [issues](https://github.com/EdurtIO/datacap/issues/new/choose) to us

- [x] 1.x
