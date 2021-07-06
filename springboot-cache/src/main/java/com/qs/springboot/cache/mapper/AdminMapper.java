package com.qs.springboot.cache.mapper;

import com.qs.springboot.cache.entity.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.*;

@CacheConfig(cacheNames = "admin")
public interface AdminMapper {
    @CacheEvict(key = "#id")
    int deleteByPrimaryKey(String id);

    int insert(Admin record);

    int insertSelective(Admin record);

    //    @Cacheable(unless = "#result == null",keyGenerator = "keyGenerator", condition = "#id !=null && #id != ''")
    @Caching(
            cacheable = {
                    @Cacheable(key = "#id")
            },
            put = {
                    @CachePut(key = "#result.username"),
                    @CachePut(key = "#result.password")
            }
    )
    Admin selectByPrimaryKey(String id);

    @Select("select * from t_admin where username=#{username}")
    @Cacheable(key = "#username")
    Admin selectByUsername(String username);

    @CachePut(key = "#record.id")
    int updateByPrimaryKeySelective(Admin record);

    @CachePut(key = "#record.id")
    int updateByPrimaryKey(Admin record);
}