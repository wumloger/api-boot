package top.wuml.rbac.service.Impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.rbac.dao.SysUserDao;
import top.wuml.rbac.entity.SysUserEntity;
import top.wuml.rbac.service.SysUserService;


/**
 * 系统用户业务实现类
 *
 * @author mqxu
 */
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends BaseServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

}

