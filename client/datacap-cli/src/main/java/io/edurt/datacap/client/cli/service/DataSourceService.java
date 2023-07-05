package io.edurt.datacap.client.cli.service;

import org.springframework.shell.table.Table;

public interface DataSourceService
{
    Table showList();

    Table getInfo();

    Table execute(String query);
}
