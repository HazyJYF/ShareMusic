package com.share.ShareMusic.service.impl;

import com.share.ShareMusic.dao.mapper.UserTestMapper;
import com.share.ShareMusic.dao.model.UserTest;
import com.share.ShareMusic.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTestServiceImpl implements UserTestService {

    @Autowired
    private UserTestMapper userTestMapper;

    @Override
    public UserTest getUserById(Integer id) {
        return userTestMapper.selectByPrimaryKey(id);
    }
}
