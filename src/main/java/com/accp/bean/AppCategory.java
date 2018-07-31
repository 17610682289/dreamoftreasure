package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: app分类表app_category
 * @Date:Create in 15:13 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppCategory {
    private Integer id;//主键编号
    private String categoryName;//分类名称
    private Integer parentId;//父亲节点
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间
}
