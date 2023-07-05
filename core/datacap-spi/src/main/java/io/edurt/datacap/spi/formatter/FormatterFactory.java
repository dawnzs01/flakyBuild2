package io.edurt.datacap.spi.formatter;

import io.edurt.datacap.spi.FormatType;

import java.util.List;

public class FormatterFactory
{
    private FormatterFactory()
    {}

    public static Formatter createFormatter(FormatType format, List<String> headers, List<Object> columns)
    {
        Formatter instance;
        if (format.equals(FormatType.JSON)) {
            instance = new JsonFormatter(headers, columns);
        }
        else if (format.equals(FormatType.CSV)) {
            instance = new CsvFormatter(headers, columns);
        }
        else {
            instance = new NoneFormatter(headers, columns);
        }
        return instance;
    }
}
