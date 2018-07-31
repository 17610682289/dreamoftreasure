package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: app软件版本表app_version
 * @Date:Create in 15:22 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppVersion {
    private Integer id;//主键编号
    private Integer appId;//软件id
    private String versionNo;//版本号
    private String versionInfo;//版本介绍
    private Integer publishStatus;//发布状态
    private String downloadLink;//下载链接
    private double versionSize;//版本大小（单位：M）
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间
}
