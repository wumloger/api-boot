package top.wuml.rbac.service.Impl;



import org.springframework.stereotype.Service;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.rbac.dao.SysUserRoleDao;
import top.wuml.rbac.entity.SysUserRoleEntity;
import top.wuml.rbac.service.SysUserRoleService;


/**
 * 用户角色关系业务实现类
 *
 * @author mqxu
 */
@Service
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {
}