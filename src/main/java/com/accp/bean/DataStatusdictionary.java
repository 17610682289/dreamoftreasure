package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: app发布状态表data_Statusdictionary
 * @Date:Create in 15:08 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataStatusdictionary {
    private Integer id;//主键编号
    private String  typeName;//发布状态名称 1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间
}
