package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: app所属平台表data_FlatFormIddictionary
 * @Date:Create in 15:10 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataFlatFormIddictionary {
    private Integer id;//主键编号
    private String  typeName;//所属平台名称 1 手机 2 平板 3 通用
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间
}
