package top.wuml.rbac.dao;


import org.apache.ibatis.annotations.Mapper;
import top.wuml.mybatis.dao.BaseDao;
import top.wuml.rbac.entity.SysRoleMenuEntity;


/**
 * 角色与菜单对应关系 dao
 *
 * @author mqxu
 */
@Mapper
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
}

