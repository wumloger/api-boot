package top.wuml.dao;


import org.apache.ibatis.annotations.Mapper;
import top.wuml.entity.NoticeEntity;
import top.wuml.mybatis.dao.BaseDao;


/**
 * NoticeDao
 *
 * @author mqxu
 **/
@Mapper
public interface NoticeDao extends BaseDao<NoticeEntity> {
}
