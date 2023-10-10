package com.sky.controller.admin;

import com.sky.result.Result;
import com.sky.service.ReportService;
import com.sky.vo.TurnoverReportVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;
import java.time.LocalDate;

/**
 * Classname: ReportContolller
 * Package: com.sky.controller.admin
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 19:58
 * @Version: v1.0
 */
@RestController
@RequestMapping("/admin/report/turnoverStatistics")
@Api(tags = "数据统计相关接口")
@Slf4j
public class ReportContolller {
    @Autowired
    private ReportService reportService;


    @GetMapping
    @ApiOperation("营业额统计")
    public Result<TurnoverReportVO> turnoverStatistics(
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        return Result.success(reportService.getTurnOverStatistics(begin, end));
    }
}
