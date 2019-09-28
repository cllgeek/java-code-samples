package org.geekjc.ehcache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author ll
 * @date 2019年09月28日 11:10 AM
 */
@Service
@CacheConfig(cacheNames = "user")
public class HelloService {
    @Cacheable
    public String hello(String name) {
        System.out.println(name);
        return "hello " + name;
    }
}
