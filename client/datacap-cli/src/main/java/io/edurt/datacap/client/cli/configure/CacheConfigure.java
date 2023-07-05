package io.edurt.datacap.client.cli.configure;

import io.edurt.datacap.client.cli.Support;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfigure
{
    @Bean
    public CacheManager cacheManager()
    {
        return new ConcurrentMapCacheManager(Support.cache);
    }
}
