package com.ysl.excel.entity;
import lombok.Data;

import java.util.Date;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
public class ExportDateTimestampMilliSecondVo {

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "姓名")
    private String name;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "生日", dateFormat = "tms")
    private Date birthDay;

}
