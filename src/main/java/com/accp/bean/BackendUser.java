package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: 后台管理员用户表backend_User
 * @Date:Create in 14:57 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackendUser {
    private Integer id;//主键编号
    private String backendCode;//后台管理员账号
    private String backendPassword;//后台管理员密码
    private String backendName;//后台管理员昵称
    private String backendInfo;//后台管理员简介
    private String backendEmail;//后台管理员邮箱
    private String backendPhone;//后台管理员手机号
    private String backendIcon;//后台管理员头像
    private Integer backendType;//后台用户的类型
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String createTime;//创建时间
    private String updateTime;//更新时间
}
