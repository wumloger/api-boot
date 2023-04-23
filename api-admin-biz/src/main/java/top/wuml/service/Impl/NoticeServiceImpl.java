package top.wuml.service.Impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.wuml.common.utils.PageResult;
import top.wuml.convert.NoticeConvert;
import top.wuml.dao.NoticeDao;
import top.wuml.entity.NoticeEntity;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.query.NoticeQuery;
import top.wuml.service.NoticeService;
import top.wuml.vo.NoticeVO;


import java.util.List;

/**
 * NoticeService 实现类
 *
 * @author mqxu
 **/
@Service
@AllArgsConstructor
public class NoticeServiceImpl extends BaseServiceImpl<NoticeDao, NoticeEntity> implements NoticeService {
    @Override
    public PageResult<NoticeVO> page(NoticeQuery query) {
        IPage<NoticeEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));
        return new PageResult<>(NoticeConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    @Override
    public List<NoticeVO> getList() {
        NoticeQuery query = new NoticeQuery();
        List<NoticeEntity> entityList = baseMapper.selectList(getWrapper(query));
        return NoticeConvert.INSTANCE.convertList(entityList);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(NoticeVO vo) {
        NoticeEntity entity = NoticeConvert.INSTANCE.convert(vo);
        baseMapper.insert(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(NoticeVO vo) {
        NoticeEntity entity = NoticeConvert.INSTANCE.convert(vo);
        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        removeById(id);
    }

    /**
     * 查询条件构造
     *
     * @param query 查询参数
     * @return 查询条件
     */

    private Wrapper<NoticeEntity> getWrapper(NoticeQuery query) {
        LambdaQueryWrapper<NoticeEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(StrUtil.isNotBlank(query.getTitle()), NoticeEntity::getTitle, query.getTitle());
        return wrapper;
    }
}

