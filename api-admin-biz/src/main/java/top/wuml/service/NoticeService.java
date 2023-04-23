package top.wuml.service;


import org.springframework.web.multipart.MultipartFile;
import top.wuml.common.utils.PageResult;
import top.wuml.entity.NoticeEntity;
import top.wuml.mybatis.service.BaseService;
import top.wuml.query.NoticeQuery;
import top.wuml.vo.NoticeVO;


import java.util.List;

/**
 * 通知模块服务接口
 *
 * @author mqxu
 **/
public interface NoticeService extends BaseService<NoticeEntity> {
    /**
     * 分页查询通知
     *
     * @param query 查询参数
     * @return 分页结果
     */
    PageResult<NoticeVO> page(NoticeQuery query);

    /**
     * 获取所有通知数据
     *
     * @return list
     */
    List<NoticeVO> getList();

    /**
     * 新增通知
     *
     * @param vo vo
     */
    void save(NoticeVO vo);

    /**
     * 修改通知
     *
     * @param vo vo
     */
    void update(NoticeVO vo);

    /**
     * 根据id删除通知
     *
     * @param id id
     */
    void delete(Long id);

}

