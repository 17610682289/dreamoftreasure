package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: app软件表app_Info
 * @Date:Create in 15:14 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppInfo {
    private Integer id;//主键编号
    private String softwareName;//软件名称
    private double softwareSize;//软件大小（单位：M）
    private Integer devId;//开发者id
    private String appInfo;//应用简介
    private Integer status;//状态
    private String  onSaleDate;//上架时间
    private String  offSaleDate;//下架时间
    private Integer flatformId;//所属平台
    private Integer categoryLevel3;//所属三级分类
    private Integer categoryLevel2;//所属二级分类
    private Integer categoryLevel1;//所属一级分类
    private Integer downloads;//下载量（单位：次）
    private String  logoPicPath;//LOGO
    private Integer versionId;//最新的版本id
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间
}
