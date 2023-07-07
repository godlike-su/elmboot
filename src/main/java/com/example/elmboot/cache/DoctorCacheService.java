package com.example.elmboot.cache;

import com.example.elmboot.entity.Doctor;
import com.example.elmboot.entity.SessionUserDetail;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DoctorCacheService {

    private static Map<String, Doctor> doctorMap = new HashMap<>();

    @Cacheable("doctorCache")
    public Doctor getCachedData(String key) {
        // 从数据库或其他数据源中获取数据
        // 如果数据已经被缓存，则直接返回缓存的数据
        // 如果数据未被缓存，则执行相应的逻辑，并将数据缓存起来
        Doctor doctor = doctorMap.get(key);
        return doctor;
    }

    @CachePut("doctorCache")
    public Doctor updateCachedData(String key, Doctor value) {
        // 更新数据
        doctorMap.put(key, value);
        // 将更新后的数据缓存起来
        return value;
    }

    @CacheEvict("doctorCache")
    public void evictCache(String key) {
        // 删除缓存中的数据
        doctorMap.remove(key);
    }
}
