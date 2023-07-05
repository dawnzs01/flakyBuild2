package io.edurt.datacap.spi;

public interface PluginModule
{
    default String getName()
    {
        return this.getClass().getSimpleName()
                .replace("PluginModule", "")
                .replace("Module", "");
    }

    PluginType getType();

    AbstractPluginModule get();
}
