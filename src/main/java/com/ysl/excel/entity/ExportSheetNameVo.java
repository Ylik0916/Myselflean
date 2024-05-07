package com.ysl.excel.entity;

import com.ysl.excel.utils.ExcelUtils;
import lombok.Data;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
@ExcelUtils.ExcelSheet(name = "用户表")
public class ExportSheetNameVo {

    @ExcelUtils.ExcelExport(name = "姓名")
    private String name;

    @ExcelUtils.ExcelExport(name = "电话")
    private String tel;

    @ExcelUtils.ExcelExport(name = "年龄")
    private Integer age;

    @ExcelUtils.ExcelExport(name = "地址")
    private String address;

}
