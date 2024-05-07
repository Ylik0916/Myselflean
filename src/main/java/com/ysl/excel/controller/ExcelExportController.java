package com.ysl.excel.controller;

import com.ysl.excel.entity.*;
import com.ysl.excel.utils.ExcelUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author Yuanqiang.Zhang
 * @since 2024/2/1
 */
@Api(tags = {"Excel导出示例"})
@RestController
@RequestMapping("/excel/export")
public class ExcelExportController {

    @GetMapping("/101")
    @ApiOperation(value = "按对象导出（基础）", produces = "application/octet-stream")
    public void forStandard(HttpServletResponse response) {
        ExportStandardVo o1 = new ExportStandardVo();
        o1.setName("诸葛亮");
        o1.setAge(28);
        o1.setDeposit(new BigDecimal("25000"));
        o1.setRemark("功盖三分国，名成八阵图");

        ExportStandardVo o2 = new ExportStandardVo();
        o2.setName("赵云");
        o2.setAge(26);
        o2.setDeposit(new BigDecimal("18000"));
        o2.setRemark("吾乃常山赵子龙");

        List<ExportStandardVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "101", list, ExportStandardVo.class);
    }

    @GetMapping("/102")
    @ApiOperation(value = "按对象导出（数据映射）", produces = "application/octet-stream")
    public void forSelect(HttpServletResponse response) {
        ExportSelectVo o1 = new ExportSelectVo();
        o1.setName("诸葛亮");
        o1.setSex(0);

        ExportSelectVo o2 = new ExportSelectVo();
        o2.setName("孙尚香");
        o2.setSex(1);

        List<ExportSelectVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "102", list, ExportSelectVo.class);
    }

    @GetMapping("/103")
    @ApiOperation(value = "按对象导出（时间格式化，默认格式（年-月-日 时:分:秒））", produces = "application/octet-stream")
    public void forDateTime(HttpServletResponse response) {
        ExportDateTimeVo o1 = new ExportDateTimeVo();
        o1.setName("张三");
        o1.setBirthDay(new Date());

        ExportDateTimeVo o2 = new ExportDateTimeVo();
        o2.setName("李四");
        o2.setBirthDay(new Date());

        List<ExportDateTimeVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "103", list, ExportDateTimeVo.class);
    }

    @GetMapping("/104")
    @ApiOperation(value = "按对象导出（时间格式化，指定格式，如：年-月-日）", produces = "application/octet-stream")
    public void forDate(HttpServletResponse response) {
        ExportDateTimeVo o1 = new ExportDateTimeVo();
        o1.setName("张三");
        o1.setBirthDay(new Date());

        ExportDateTimeVo o2 = new ExportDateTimeVo();
        o2.setName("李四");
        o2.setBirthDay(new Date());

        List<ExportDateTimeVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "104", list, ExportDateTimeVo.class);
    }

    @GetMapping("/105")
    @ApiOperation(value = "按对象导出（时间格式化，时间戳（秒级））", produces = "application/octet-stream")
    public void forDateTimestampSecond(HttpServletResponse response) {
        ExportDateTimestampSecondVo o1 = new ExportDateTimestampSecondVo();
        o1.setName("张三");
        o1.setBirthDay(new Date());

        ExportDateTimestampSecondVo o2 = new ExportDateTimestampSecondVo();
        o2.setName("李四");
        o2.setBirthDay(new Date());

        List<ExportDateTimestampSecondVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "105", list, ExportDateTimestampSecondVo.class);
    }

    @GetMapping("/106")
    @ApiOperation(value = "按对象导出（时间格式化，时间戳（豪秒级））", produces = "application/octet-stream")
    public void forDateTimestampMilliSecond(HttpServletResponse response) {
        ExportDateTimestampMilliSecondVo o1 = new ExportDateTimestampMilliSecondVo();
        o1.setName("张三");
        o1.setBirthDay(new Date());

        ExportDateTimestampMilliSecondVo o2 = new ExportDateTimestampMilliSecondVo();
        o2.setName("李四");
        o2.setBirthDay(new Date());

        List<ExportDateTimestampMilliSecondVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "106", list, ExportDateTimestampMilliSecondVo.class);
    }

    @GetMapping("/107")
    @ApiOperation(value = "按对象导出（列排序）", produces = "application/octet-stream")
    public void forColumnIndex(HttpServletResponse response) {
        ExportColumnIndexVo o1 = new ExportColumnIndexVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportColumnIndexVo o2 = new ExportColumnIndexVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportColumnIndexVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "107", list, ExportColumnIndexVo.class);
    }

    @GetMapping("/108")
    @ApiOperation(value = "按对象导出（表头批注）", produces = "application/octet-stream")
    public void forComment(HttpServletResponse response) {
        ExportCommentVo o1 = new ExportCommentVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");

        ExportCommentVo o2 = new ExportCommentVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");

        List<ExportCommentVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "108", list, ExportCommentVo.class);
    }

    @GetMapping("/109")
    @ApiOperation(value = "按对象导出（设置指定列宽）", produces = "application/octet-stream")
    public void forColumnWidth(HttpServletResponse response) {
        ExportColumnWidthVo o1 = new ExportColumnWidthVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportColumnWidthVo o2 = new ExportColumnWidthVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportColumnWidthVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "109", list, ExportColumnWidthVo.class);
    }

    @GetMapping("/110")
    @ApiOperation(value = "按对象导出（设置页名称）", produces = "application/octet-stream")
    public void forSheetName(HttpServletResponse response) {
        ExportSheetNameVo o1 = new ExportSheetNameVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportSheetNameVo o2 = new ExportSheetNameVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportSheetNameVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "110", list, ExportSheetNameVo.class);
    }

    @GetMapping("/111")
    @ApiOperation(value = "按对象导出（设置全局列宽）", produces = "application/octet-stream")
    public void forAllColumnWidth(HttpServletResponse response) {
        ExportAllColumnWidthVo o1 = new ExportAllColumnWidthVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportAllColumnWidthVo o2 = new ExportAllColumnWidthVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportAllColumnWidthVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "111", list, ExportAllColumnWidthVo.class);
    }

    @GetMapping("/112")
    @ApiOperation(value = "按对象导出（冻结表头所在行）", produces = "application/octet-stream")
    public void forFreezeHeader(HttpServletResponse response) {
        List<ExportFreezeHeaderVo> list = new ArrayList<>();
        int rows = 100;
        for (int i = 0; i < rows; i++) {
            ExportFreezeHeaderVo o = new ExportFreezeHeaderVo();
            o.setName("诸葛亮" + i);
            o.setTel("1399999999" + i);
            o.setAge(26 + i);
            o.setAddress("四川隆中" + i);
            list.add(o);
        }
        ExcelUtils.export(response, "112", list, ExportFreezeHeaderVo.class);
    }

    @GetMapping("/113")
    @ApiOperation(value = "按对象导出（添加水印图片（文字））", produces = "application/octet-stream")
    public void forWaterMarkWord(HttpServletResponse response) {
        ExportWatermarkWordVo o1 = new ExportWatermarkWordVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportWatermarkWordVo o2 = new ExportWatermarkWordVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportWatermarkWordVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "113", list, ExportWatermarkWordVo.class);
    }

    @GetMapping("/114")
    @ApiOperation(value = "按对象导出（添加水印图片（网络图片））", produces = "application/octet-stream")
    public void forWaterMarkWebImage(HttpServletResponse response) {
        ExportWatermarkWebImageVo o1 = new ExportWatermarkWebImageVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportWatermarkWebImageVo o2 = new ExportWatermarkWebImageVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportWatermarkWebImageVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "114", list, ExportWatermarkWebImageVo.class);
    }

    @GetMapping("/115")
    @ApiOperation(value = "按对象导出（添加水印图片（本地图片））", produces = "application/octet-stream")
    public void forWaterMarkFileImage(HttpServletResponse response) {
        ExportWatermarkFileImageVo o1 = new ExportWatermarkFileImageVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportWatermarkFileImageVo o2 = new ExportWatermarkFileImageVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportWatermarkFileImageVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "115", list, ExportWatermarkFileImageVo.class);
    }

    @GetMapping("/116")
    @ApiOperation(value = "按对象导出（忽略表头）", produces = "application/octet-stream")
    public void forIgnoreHeader(HttpServletResponse response) {
        ExportIgnoreHeaderVo o1 = new ExportIgnoreHeaderVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportIgnoreHeaderVo o2 = new ExportIgnoreHeaderVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportIgnoreHeaderVo> list = Arrays.asList(o1, o2);

        ExcelUtils.export(response, "116", list, ExportIgnoreHeaderVo.class);
    }

    @GetMapping("/117")
    @ApiOperation(value = "按对象导出（合并单元格）", produces = "application/octet-stream")
    public void forMergeCell(HttpServletResponse response) {
        ExportMergeCellVo o1 = new ExportMergeCellVo();
        o1.setName("诸葛亮");
        o1.setTel("13999999999");
        o1.setAge(26);
        o1.setAddress("四川隆中");

        ExportMergeCellVo o2 = new ExportMergeCellVo();
        o2.setName("赵子龙");
        o2.setTel("13888888888");
        o2.setAge(23);
        o2.setAddress("河北常山");

        List<ExportMergeCellVo> list = Arrays.asList(o1, o2);

        // 合并单元格
        List<ExcelUtils.ExportCellMerge> mergers = new ArrayList<>();
        mergers.add(new ExcelUtils.ExportCellMerge(2,6,4,7));
        mergers.add(new ExcelUtils.ExportCellMerge(1,10,2,21));

        ExcelUtils.export(response, "117", list, ExportMergeCellVo.class, mergers);
    }

    @GetMapping("/118")
    @ApiOperation(value = "万能导出", produces = "application/octet-stream")
    public void forDiy(HttpServletResponse response) {
        // 数据行（包含表头和数据）
        ExcelUtils.ExportRow row1 = new ExcelUtils.ExportRow();
        row1.setHeader(true);
        row1.appendCells("姓名", "年龄", "出生年月");
        ExcelUtils.ExportRow row2 = new ExcelUtils.ExportRow();
        row2.setHeader(false);
        row2.appendCells("诸葛亮", 26).appendCell(new Date(), "yyyy-MM-dd");
        ExcelUtils.ExportRow row3 = new ExcelUtils.ExportRow();
        row3.setHeader(false);
        row3.appendCells("赵云", 23).appendCell(new Date(), "yyyy-MM-dd");
        List<ExcelUtils.ExportRow> rows = Arrays.asList(row1, row2, row3);
        // 批注
        ExcelUtils.ExportComment comment1 = new ExcelUtils.ExportComment();
        comment1.setX(1);
        comment1.setY(0);
        comment1.setComment("（1）1-5 幼年期；\n（2）6-10 儿童期；\n（3）11-17 少年期；\n（4）18-40 青年期；\n（5）41-65 中年期；\n（6）66 + 老年期");
        List<ExcelUtils.ExportComment> comments = Arrays.asList(comment1);
        // 水印
        ExcelUtils.ExportWatermark watermark = new ExcelUtils.ExportWatermark();
        watermark.setType(1);
        watermark.setSrc("自定义导出示例");
        // 合并单元格
        List<ExcelUtils.ExportCellMerge> mergers = new ArrayList<>();
        mergers.add(new ExcelUtils.ExportCellMerge(2,6,4,7));
        mergers.add(new ExcelUtils.ExportCellMerge(1,10,2,21));
        // 指定列宽
        Map<Integer, Integer> columnIndexWidthMap = new HashMap<>();
        columnIndexWidthMap.put(0, 20);
        columnIndexWidthMap.put(1, 15);
        columnIndexWidthMap.put(2, 30);
        // 组装页数据（除了上面字段外，更多字段用法，请看 ExportSheet 类中属性注释）
        ExcelUtils.ExportSheet sheet1 = new ExcelUtils.ExportSheet();
        sheet1.setName("学生表1");
        sheet1.setRows(rows);
        sheet1.setComments(comments);
        sheet1.setWatermark(watermark);
        sheet1.setMerges(mergers);
        sheet1.setColumnIndexWidthMap(columnIndexWidthMap);
        ExcelUtils.ExportSheet sheet2 = new ExcelUtils.ExportSheet();
        sheet2.setName("学生表2");
        sheet2.setRows(rows);
        sheet2.setComments(comments);
        sheet2.setWatermark(watermark);
        sheet2.setMerges(mergers);
        sheet2.setColumnIndexWidthMap(columnIndexWidthMap);
        List<ExcelUtils.ExportSheet> sheets = Arrays.asList(sheet1, sheet2);
        // 导出
        ExcelUtils.export(response, "118", sheets);
    }
}
