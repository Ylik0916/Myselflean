package com.ysl.excel.entity;
import lombok.Data;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
public class ExportColumnIndexVo {

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "姓名", columnIndex = 1)
    private String name;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "电话", columnIndex = 3)
    private String tel;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "年龄", columnIndex = 4)
    private Integer age;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "地址", columnIndex = 2)
    private String address;

}
