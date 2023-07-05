---
title: AliYun OSS
---

<img src="/assets/plugin/alioss.png" class="connector-logo" style="width: 50px;" />

#### What is Aliyun OSS ?

Fully managed object storage service to store and access any amount of data from anywhere

#### Environment

---

!!! note

    If you need to use this data source, you need to upgrade the DataCap service to >= `1.6.x`

Support Time: `2023-02-23`

#### SQL statement syntax

---

This chapter describes the SQL syntax used in Aliyun OSS on DataCap.

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
 
    If it is a multi-level directory, such as `/oss/id/2`, it will be written **\`oss\`.\`id\`.\`2\`**, and use `.` to split between directories.

#### Configure

---

DataCap uses configuration files by default [alioss.json](https://github.com/EdurtIO/datacap/blob/dev/server/src/main/etc/conf/plugins/native/alioss.json)

!!! note

    If your Aliyun OSS service version requires other special configurations, please refer to modifying the configuration file and restarting the DataCap service.

=== "Configure"

    | Field  |             Required              |             Default Value             |
    |:------:|:---------------------------------:|:-------------------------------------:|
    | `Name` | :material-check-circle: { .red }  |                   -                   |
    | `Host` | :material-check-circle:  { .red } | `https://oss-cn-regison.aliyuncs.com` |

=== "Authorization"

    |   Field    |             Required              |  Description  | Default Value |
    |:----------:|:---------------------------------:|:-------------:|:-------------:|
    | `Username` | :material-check-circle: { .red }  |   access Id   |       -       |
    | `Password` | :material-check-circle:  { .red } | access Secret |       -       |

=== "Advanced"

    |   Field    |             Required             | Description | Default Value |
    |:----------:|:--------------------------------:|:-----------:|:-------------:|
    | `Database` | :material-check-circle: { .red } | bucket name |   `default`   |

#### Version (Validation)

---

!!! warning

    The online service has not been tested yet, if you have detailed test results, please submit [issues](https://github.com/EdurtIO/datacap/issues/new/choose) to us

- [x] `all version`
