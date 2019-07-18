package com.liu.demo.model.bean;

import lombok.*;

/**
 * @description
 * @author 刘梦辉
 * @date 2019/7/18
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserPO {

    private Integer id;

    private String userName;

    private String passWord;

    private String realName;
}
