---
title: StarRocks
status: new
---

<img src="/assets/plugin/starrocks.png" class="connector-logo" />

#### What is StarRocks ?

An Open-Source, High-Performance Analytical Database

#### Environment

!!! note

    If you need to use this data source, you need to upgrade the DataCap service to >= `1.9.x`

Support Time: `2023-04-20`

#### Configure

---

!!! note

    If your StarRocks service version requires other special configurations, please refer to modifying the configuration file and restarting the DataCap service.

=== "Configure"

    | Field  |             Required              | Default Value |
    |:------:|:---------------------------------:|:-------------:|
    | `Name` | :material-check-circle: { .red }  |       -       |
    | `Host` | :material-check-circle:  { .red } |  `127.0.0.1`  |
    | `Port` | :material-check-circle:  { .red } |     `9030`    |

=== "Authorization"

    |   Field    |        Required         | Default Value |
    |:----------:|:-----------------------:|:-------------:|
    | `Username` | :material-close-circle: |       -       |
    | `Password` | :material-close-circle: |       -       |

=== "Advanced"

    |   Field    |        Required         | Default Value |
    |:----------:|:-----------------------:|:-------------:|
    | `Database` | :material-close-circle: |       -       |

#### Version (Validation)

---

!!! warning

    The online service has not been tested yet, if you have detailed test results, please submit [issues](https://github.com/EdurtIO/datacap/issues/new/choose) to us

- [x] 2.2.x
