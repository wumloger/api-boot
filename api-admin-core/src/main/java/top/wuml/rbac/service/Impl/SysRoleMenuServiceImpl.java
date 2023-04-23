package top.wuml.rbac.service.Impl;


import org.springframework.stereotype.Service;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.rbac.dao.SysRoleMenuDao;
import top.wuml.rbac.entity.SysRoleMenuEntity;
import top.wuml.rbac.service.SysRoleMenuService;


/**
 * 角色与菜单对应业务实现类
 *
 * @author mqxu
 */
@Service
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}