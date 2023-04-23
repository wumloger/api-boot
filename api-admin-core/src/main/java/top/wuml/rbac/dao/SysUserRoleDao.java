package top.wuml.rbac.dao;


import org.apache.ibatis.annotations.Mapper;
import top.wuml.mybatis.dao.BaseDao;
import top.wuml.rbac.entity.SysUserRoleEntity;


/**
 * 用户角色关系 dao
 *
 * @author mqxu
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

}