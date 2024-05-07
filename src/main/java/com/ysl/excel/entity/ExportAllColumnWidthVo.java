package com.ysl.excel.entity;

import lombok.Data;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
@com.ysl.excel.utils.ExcelUtils.ExcelSheet(name = "用户表", columnWidth = 30)
public class ExportAllColumnWidthVo {

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "姓名")
    private String name;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "电话")
    private String tel;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "年龄")
    private Integer age;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "地址")
    private String address;

}
