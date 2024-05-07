package com.ysl.excel.entity;
import lombok.Data;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
public class ExportColumnWidthVo {

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "姓名", columnWidth = 10)
    private String name;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "电话", columnWidth = 15)
    private String tel;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "年龄", columnWidth = 5)
    private Integer age;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "地址", columnWidth = 20)
    private String address;

}
