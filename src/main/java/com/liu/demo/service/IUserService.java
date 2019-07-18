package com.liu.demo.service;

import com.liu.demo.model.bean.UserPO;

/**
 * @description
 * @author 刘梦辉
 * @date 2019/7/18
 */
public interface IUserService {

    /**
     * 获取user
     * @param id
     * @return
     */
    UserPO getUser(int id);
}