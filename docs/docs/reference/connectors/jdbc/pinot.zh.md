---
title: Apache Pinot
status: 1.10.0
---

<img src="/assets/plugin/pinot.png" class="connector-logo" style="width: 100px;" />

#### 什么是 Pinot ?

Apache Pinot 是一个实时分布式 OLAP 数据存储，专为低延迟、高吞吐量分析而构建，非常适合面向用户的分析工作负载。

#### 环境

---

!!! note

    如果需要使用该数据源，需要将DataCap服务升级到 >= `1.10.x`

支持时间: `2023-05-06`

#### 配置

---


!!! note

    如果您的服务版本需要其他特殊配置，请参考修改配置文件并重启DataCap服务。

=== "配置"

    | Field  |             Required              | Default Value |
    |:------:|:---------------------------------:|:-------------:|
    | `Name` | :material-check-circle: { .red }  |       -       |
    | `Host` | :material-check-circle:  { .red } |  `127.0.0.1`  |
    | `Port` | :material-check-circle:  { .red } |     `9000`    |

=== "授权"

    |   Field    |             Required              | Default Value |
    |:----------:|:---------------------------------:|:-------------:|
    | `Username` | :material-check-circle: { .red }  |       -       |
    | `Password` | :material-check-circle:  { .red } |       -       |

#### 版本 (验证)

---

!!! warning

    服务版本尚未测试，如果您有详细的测试并发现错误，请提交 [issues](https://github.com/EdurtIO/datacap/issues/new/choose)

- [x] `0.8.x`
