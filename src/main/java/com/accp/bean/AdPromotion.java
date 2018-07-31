package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: 广告表ad_promotion
 * @Date:Create in 15:26 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPromotion {
    private Integer id;//主键编号
    private Integer appId;//软件id
    private String adPicPath;//广告图片存储路径
    private Integer adPV;//广告点击量
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间

}
