package com.ysl.excel.entity;

import com.ysl.excel.utils.ExcelUtils;
import lombok.Data;

import java.util.Date;

/**
 * @Author Ysl
 * @Date 2024/4/28
 * @name Myselflean
 **/
@Data
@ExcelUtils.ExcelSheet(name = "用户表", watermark = @ExcelUtils.Watermark(type = 3, src ="https://profileavatar.csdnimg.cn/37f95edca8614683923fa0b9455058f6_qq_53438100.jpg!1"))
public class User {
    @ExcelUtils.ExcelExport(name = "序号")
    private int id;
    @ExcelUtils.ExcelExport(name = "姓名")
    private String name;
    @ExcelUtils.ExcelExport(name = "性别")
    private int sex;
    @ExcelUtils.ExcelExport(name = "身份证号")
    private int id_card;
    @ExcelUtils.ExcelExport(name = "电话")
    private int phone;
    @ExcelUtils.ExcelExport(name = "会员类型")
    private String v_type;
    @ExcelUtils.ExcelExport(name = "开始时间")
    private Date start_time;
    @ExcelUtils.ExcelExport(name = "结束时间")
    private Date end_time;

}
