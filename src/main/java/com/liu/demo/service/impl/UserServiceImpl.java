package com.liu.demo.service.impl;

import com.liu.demo.dao.IUserDAO;
import com.liu.demo.model.bean.UserPO;
import com.liu.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘梦辉
 * @description
 * @date 2019/7/18
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public UserPO getUser(int id) {
        return userDAO.getUser(id);
    }
}
