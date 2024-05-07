package com.ysl.excel.entity;

import com.ysl.excel.utils.ExcelUtils;
import lombok.Data;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/4
 */
@Data
@ExcelUtils.ExcelSheet(name = "用户表", watermark = @ExcelUtils.Watermark(type = 3, src = "https://profile-avatar.csdnimg.cn/624a0ef43e224cb2bf5ffbcca1211e51_sunnyysl.excel.jpg"))
public class ExportWatermarkWebImageVo {

    @ExcelUtils.ExcelExport(name = "姓名")
    private String name;

    @ExcelUtils.ExcelExport(name = "电话")
    private String tel;

    @ExcelUtils.ExcelExport(name = "年龄")
    private Integer age;

    @ExcelUtils.ExcelExport(name = "地址")
    private String address;

}
