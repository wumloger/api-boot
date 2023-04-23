package top.wuml.rbac.service.Impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.rbac.dao.SysUserDao;
import top.wuml.rbac.entity.SysUserEntity;
import top.wuml.rbac.service.SysUserService;


/**
 * 系统用户服务实现类
 *
 * @author mqxu
 */
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends BaseServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updatePassword(Long id, String newPassword) {
        // 修改密码
        SysUserEntity user = getById(id);
        user.setPassword(newPassword);
        updateById(user);
    }

}


