package top.wuml.rbac.service.Impl;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.rbac.dao.SysRoleDao;
import top.wuml.rbac.entity.SysRoleEntity;
import top.wuml.rbac.service.SysRoleService;


/**
 * 系统角色业务实现类
 *
 * @author mqxu
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

}