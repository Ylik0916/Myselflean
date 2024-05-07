package com.ysl.excel.controller;

import com.ysl.excel.utils.ExcelUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author Ysl
 * @Date 2024/4/29
 * @name Myselflean
 **/
@RestController
public class ExportController {

    @GetMapping("/export/ysl")
    @ApiOperation(value = "万能导出", produces = "application/octet-stream")
    public void export(HttpServletResponse response){

        ExcelUtils.ExportRow rows1 = new ExcelUtils.ExportRow();
        //首先判断是否为表头，然后将数据放入对应的行
        rows1.setHeader(true);
        rows1.appendCells("序号","姓名","性别","身份证号","电话","会员类型","开始时间","结束时间");
        ExcelUtils.ExportRow rows2 = new ExcelUtils.ExportRow();
        //首先判断是否为表头，然后将数据放入对应的行
        rows2.setHeader(false);
        rows2.appendCells(1,"王二","男","130432200109160256","15834569852","普通会员")
                .appendCell(new Date(),"yyyy-MM-dd")
                .appendCell(new Date(),"yyyy-MM-dd");
        //合并1，2列
        List<ExcelUtils.ExportRow> list = Arrays.asList(rows1,rows2);

        //设置批注
        ExcelUtils.ExportComment comment = new ExcelUtils.ExportComment();
        comment.setX(5);
        comment.setY(0);
        comment.setComment("普通会员; \n vip会员;\n 超级会员;" );
        //合并批注
        List<ExcelUtils.ExportComment> comments = Arrays.asList(comment);

        //设置水印
        ExcelUtils.ExportWatermark watermark = new ExcelUtils.ExportWatermark();
        watermark.setType(1);
        watermark.setSrc("ysl测试");

        //设置sheet页
        ExcelUtils.ExportSheet sheet = new ExcelUtils.ExportSheet();
        sheet.setWatermark(watermark);
        sheet.setRows(list);
        sheet.setComments(comments);
        sheet.setName("ysl测试");
        List<ExcelUtils.ExportSheet> sheets = Arrays.asList(sheet);
        ExcelUtils.export(response,"100",sheets);
    }
}
