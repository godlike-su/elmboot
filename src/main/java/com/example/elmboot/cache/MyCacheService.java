package com.example.elmboot.cache;

import com.example.elmboot.entity.SessionUserDetail;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyCacheService {

    private static Map<String, SessionUserDetail> map = new HashMap<>();

    @Cacheable("myCache")
    public SessionUserDetail getCachedData(String key) {
        // 从数据库或其他数据源中获取数据
        // 如果数据已经被缓存，则直接返回缓存的数据
        // 如果数据未被缓存，则执行相应的逻辑，并将数据缓存起来
        SessionUserDetail sessionUserDetail = map.get(key);
        return sessionUserDetail;
    }

    @CachePut("myCache")
    public SessionUserDetail updateCachedData(String key, SessionUserDetail value) {
        // 更新数据
        map.put(key, value);
        // 将更新后的数据缓存起来
        return value;
    }

    @CacheEvict("myCache")
    public void evictCache(String key) {
        // 删除缓存中的数据
        map.remove(key);
    }
}
