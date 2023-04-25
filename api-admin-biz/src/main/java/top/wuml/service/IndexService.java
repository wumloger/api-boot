package top.wuml.service;

import top.wuml.vo.BarVO;
import top.wuml.vo.LabelVO;
import top.wuml.vo.PanelVO;

import java.util.List;
import java.util.Map;

public interface IndexService {

    List<PanelVO> statistics1();

    BarVO statistics2();

    Map<String,List<LabelVO>> statistics3();
}
