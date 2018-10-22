package com.hr.service;

import com.hr.entity.Users;
import com.hr.mapper.UsersMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsersService {
    @Autowired
    private UsersMapper um;

    @Cacheable("selectAll")
    public List<Users> selectAll(){
        return um.selectAll();
    }

    @Cacheable("login")
    public Users login(String uname,String upass){
        Map<String,String> map = new HashMap<String ,String>();
        map.put("uname",uname);
        map.put("upass",upass);
        return um.login(map);
    }
}
