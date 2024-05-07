package com.ysl.excel.entity;
import lombok.Data;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/2
 */
@Data
public class ExportCommentVo {

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "姓名")
    private String name;

    @com.ysl.excel.utils.ExcelUtils.ExcelExport(name = "年龄", comment = "（1）1-5 幼年期；\n（2）6-10 儿童期；\n（3）11-17 少年期；\n（4）18-40 青年期；\n（5）41-65 中年期；\n（6）66 + 老年期")
    private String tel;

}
