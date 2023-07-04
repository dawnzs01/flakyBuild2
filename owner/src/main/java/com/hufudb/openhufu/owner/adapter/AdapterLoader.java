package com.hufudb.openhufu.owner.adapter;

import com.google.common.collect.ImmutableMap;
import com.hufudb.openhufu.common.enums.DataSourceType;
import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdapterLoader {
  private static final Logger LOG = LoggerFactory.getLogger(AdapterLoader.class);

  private AdapterLoader() {}

  public static Map<DataSourceType, AdapterFactory> loadAdapters(String adapterDirectory) {
    LOG.info("Load adapter from {}", adapterDirectory);
    File adapters[]= new File(adapterDirectory).listFiles(new FileFilter() {
      @Override
      public boolean accept(File file) {
        return file.getName().endsWith(".jar");
      }
    });
    List<URL> adapterURLs = new ArrayList<>(adapters.length);
    for (File adapter : adapters) {
      try {
        adapterURLs.add(adapter.toURI().toURL());
        LOG.info("Add JAR {}", adapter.getAbsolutePath());
      } catch (Exception e) {
        LOG.info("Add JAR {} error", adapter.getAbsolutePath(), e);
      }
    }
    ClassLoader adapterClassLoader = new URLClassLoader(adapterURLs.toArray(new URL[0]), AdapterFactory.class.getClassLoader());
    ServiceLoader<AdapterFactory> adapterServices = ServiceLoader.load(AdapterFactory.class, adapterClassLoader);
    ImmutableMap.Builder<DataSourceType, AdapterFactory> adapterFactories = ImmutableMap.builder();
    for (AdapterFactory factory : adapterServices) {
      adapterFactories.put(factory.getType(), factory);
      LOG.info("get adapter factory {}", factory.getClass().getName());
    }
    return adapterFactories.build();
  }
}
