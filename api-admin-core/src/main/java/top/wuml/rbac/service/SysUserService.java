package top.wuml.rbac.service;


import top.wuml.mybatis.service.BaseService;
import top.wuml.rbac.entity.SysUserEntity;

/**
 * 系统用户业务接口
 *
 * @author mqxu
 */
public interface SysUserService extends BaseService<SysUserEntity> {

    void updatePassword(Long id, String newPassword);
}
