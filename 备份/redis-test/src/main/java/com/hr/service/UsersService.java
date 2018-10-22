package com.hr.service;

import com.hr.entity.Users;
import com.hr.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UsersService {
    @Autowired
    private UsersMapper um;

    @Cacheable("selectAll")
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Users> selectAll(){
        return um.selectAll();
    }

    @CacheEvict(value="selectAll",allEntries = true)
    public int insert(Users u){
        um.insert(u);
        return u.getUid();
    }
}
