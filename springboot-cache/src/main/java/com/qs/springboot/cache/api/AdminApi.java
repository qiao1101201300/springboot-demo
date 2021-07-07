package com.qs.springboot.cache.api;

import com.qs.springboot.cache.entity.Admin;
import com.qs.springboot.cache.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminApi {
    @Autowired
    AdminMapper adminMapper;

    @GetMapping("getAdmin")
    public Admin getAdmin(@RequestParam String id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @GetMapping("getAdminByUserName")
    public Admin getAdminByUserName(@RequestParam String username) {
        return adminMapper.selectByUsername(username);
    }

    @GetMapping("delAdmin")
    public int delAdmin(@RequestParam String id) {
        return adminMapper.deleteByPrimaryKey(id);
    }
}
