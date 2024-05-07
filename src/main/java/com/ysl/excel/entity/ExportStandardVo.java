package com.ysl.excel.entity;

import com.ysl.excel.utils.ExcelUtils;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
public class ExportStandardVo {

    @ExcelUtils.ExcelExport(name = "姓名")
    private String name;

    @ExcelUtils.ExcelExport(name = "年龄")
    private Integer age;

    @ExcelUtils.ExcelExport(name = "存款（RMB）")
    private BigDecimal deposit;

    @ExcelUtils.ExcelExport(name = "备注")
    private String remark;

}
