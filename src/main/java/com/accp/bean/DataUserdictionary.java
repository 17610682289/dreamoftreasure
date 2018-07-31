package com.accp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Shuxule
 * @Description: 后台管理员用户类型表 data_Userdictionary
 * @Date:Create in 15:01 2018/07/30
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataUserdictionary {
    private Integer id;//主键编号
    private String  typeName;//后台管理员类型名称 (超管、财务、市场、运营、销售)
    private Integer createdBy;//创建者
    private Integer modifyBy;//更新者
    private String  createTime;//创建时间
    private String  updateTime;//更新时间
}
