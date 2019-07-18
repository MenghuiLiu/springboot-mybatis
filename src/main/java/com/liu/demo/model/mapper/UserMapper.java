package com.liu.demo.model.mapper;

import com.liu.demo.model.bean.UserPO;
import org.apache.ibatis.annotations.Param;

/**
 * @description
 * @author 刘梦辉
 * @date 2019/7/18
 */
public interface UserMapper {

    /**
     * 获取user
     * @param id
     * @return
     */
    UserPO getUser(@Param("id") int id);
}