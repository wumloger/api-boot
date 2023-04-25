package top.wuml.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.wuml.common.utils.Result;
import top.wuml.service.IndexService;
import top.wuml.vo.BarVO;
import top.wuml.vo.LabelVO;
import top.wuml.vo.PanelVO;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys/index")
@Tag(name = "首页统计")
@AllArgsConstructor
public class IndexController {
    private final IndexService indexService;

    @GetMapping("statistics1")
    @Operation(summary = "统计组件1")
    public Result<List<PanelVO>> getStatistics1(){
        List<PanelVO> list = indexService.statistics1();
        return Result.ok(list);
    }

    @GetMapping("statistics2")
    @Operation(summary = "统计组件2")
    public Result<BarVO> getStatistics2(){
        BarVO barVO = indexService.statistics2();
        return Result.ok(barVO);
    }

    @GetMapping("statistics3")
    @Operation(summary = "统计组件3")
    public Result<Map<String,List<LabelVO>>> getStatistics3(){
        Map<String,List<LabelVO>> map = indexService.statistics3();
        return Result.ok(map);
    }
}
