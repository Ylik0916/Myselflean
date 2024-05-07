package com.ysl.excel.entity;

import com.ysl.excel.utils.ExcelUtils;
import lombok.Data;

import java.util.Date;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
public class ExportDateVo {

    @ExcelUtils.ExcelExport("姓名")
    private String name;

    @ExcelUtils.ExcelExport("生日")
    private Date birthDay;

}
