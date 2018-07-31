package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: 开发者用户表用户表Dev_User
 * @Date:Create in 14:52 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DevUser {
    private Integer id;//主键编号
    private String devCode;//开发者账号
    private String devPassword;//开发者密码
    private String devName;//开发者昵称
    private String devInfo;//开发者简介
    private String devEmail;//开发者邮箱
    private String devPhone;//开发者手机号
    private String devIcon;//开发者头像
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String createTime;//创建时间
    private String updateTime;//更新时间
}
