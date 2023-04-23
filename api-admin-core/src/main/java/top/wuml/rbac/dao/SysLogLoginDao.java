package top.wuml.rbac.dao;


import org.apache.ibatis.annotations.Mapper;
import top.wuml.mybatis.dao.BaseDao;
import top.wuml.rbac.entity.SysLogLoginEntity;


/**
 * 登录日志 dao
 *
 * @author mqxu
 **/
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}
