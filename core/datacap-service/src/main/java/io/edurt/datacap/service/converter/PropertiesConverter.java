package io.edurt.datacap.service.converter;

import io.edurt.datacap.common.utils.JsonUtils;

import javax.persistence.AttributeConverter;

import java.util.Properties;

public class PropertiesConverter
        implements AttributeConverter<Properties, String>
{
    @Override
    public String convertToDatabaseColumn(Properties properties)
    {
        return JsonUtils.toJSON(properties);
    }

    @Override
    public Properties convertToEntityAttribute(String s)
    {
        return JsonUtils.toProperties(s);
    }
}
