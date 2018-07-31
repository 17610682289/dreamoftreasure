package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: app版本发布状态表datar_PublishStatusdictionary
 * @Date:Create in 15:03 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatarPublishStatusdictionary {
    private Integer id;//主键编号
    private String  typeName;//App版本发布状态名称 1 不发布 2 已发布 3 预发布
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间
}
