package com.ysl.excel.entity;

import com.ysl.excel.utils.ExcelUtils;
import lombok.Data;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Data
public class ExportSelectVo {

    @ExcelUtils.ExcelExport(name = "姓名")
    private String name;

    @ExcelUtils.ExcelExport(name = "性别", kvs = {
            @ExcelUtils.KV(k = "0", v = "男"),
            @ExcelUtils.KV(k = "1", v = "女"),
    })
    private Integer sex;

}
