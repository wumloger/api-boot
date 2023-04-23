package top.wuml.rbac.service.Impl;



import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import top.wuml.rbac.convert.SysUserConvert;
import top.wuml.rbac.entity.SysUserEntity;
import top.wuml.rbac.enums.UserStatusEnum;
import top.wuml.rbac.service.SysUserDetailsService;
import top.wuml.security.user.UserDetail;

import java.util.HashSet;
import java.util.Set;


/**
 * 用户详细信息接口实现类
 *
 * @author mqxu
 */
@Service
@AllArgsConstructor
public class SysUserDetailsServiceImpl implements SysUserDetailsService {

    @Override
    public UserDetails getUserDetails(SysUserEntity userEntity) {
        // 转换成UserDetail对象
        UserDetail userDetail = SysUserConvert.INSTANCE.convertDetail(userEntity);

        // 账号不可用
        if (userEntity.getStatus() == UserStatusEnum.DISABLE.getValue()) {
            userDetail.setEnabled(false);
        }

        // 用户权限列表
        Set<String> authoritySet = new HashSet<>();
        userDetail.setAuthoritySet(authoritySet);

        return userDetail;
    }

}

