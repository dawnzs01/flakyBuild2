---
title: QuestDB
status: new
---

<img src="/assets/plugin/questdb.png" class="connector-logo" />

#### 什么是 QuestDB ?

QuestDB 是一个开源时间序列数据库，用于高吞吐量摄取和快速 SQL 查询，操作简单。它支持使用 InfluxDB 行协议、PostgreSQL 有线协议和用于批量导入和导出的 REST API 进行与模式无关的摄取。

#### 环境

!!! note

    如果你需要使用这个数据源, 您需要将 DataCap 服务升级到 >= `1.9.x`

支持时间: `2023-04-17`

#### 配置

---

!!! note

    如果您的 QuestDB 服务版本需要其他特殊配置，请参考修改配置文件并重启 DataCap 服务。

=== "配置"

    | Field  |             Required              | Default Value |
    |:------:|:---------------------------------:|:-------------:|
    | `Name` | :material-check-circle: { .red }  |       -       |
    | `Host` | :material-check-circle:  { .red } |  `127.0.0.1`  |
    | `Port` | :material-check-circle:  { .red } |    `9000`     |

#### 版本（验证）

---

!!! warning

    服务版本尚未测试，如果您有详细的测试并发现错误，请提交 [issues](https://github.com/EdurtIO/datacap/issues/new/choose)

- [x] 7.x
