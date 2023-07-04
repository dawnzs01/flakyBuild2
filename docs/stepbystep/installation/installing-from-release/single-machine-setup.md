---
description: For standalone local Spark without a cluster
---

# Single Machine Setup

Zingg can be easily run on a single machine to process up to a few million records.

To prepare your machine, please do the following steps:

A) Install the specified JDK version

B) Apache Spark - Download the specified version from spark.apache.org and unzip it in a folder under home

Please add the following entries to \~/.bash\_aliases

> export JAVA\_HOME=path to jdk

> export SPARK\_HOME=path to location of Apache Spark

> export SPARK\_MASTER=local\[\*]

C) Correct entry of host under /etc/hosts

Run ifconfig to find the IP of the machine and make sure it is added to the /etc/hosts for localhost.
