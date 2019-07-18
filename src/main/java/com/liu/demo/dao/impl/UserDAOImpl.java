package com.liu.demo.dao.impl;

import com.liu.demo.dao.IUserDAO;
import com.liu.demo.model.bean.UserPO;
import com.liu.demo.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘梦辉
 * @description
 * @date 2019/7/18
 */
@Service
public class UserDAOImpl implements IUserDAO {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserPO getUser(int id) {
        return userMapper.getUser(id);
    }
}
