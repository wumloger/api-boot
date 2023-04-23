package top.wuml.rbac.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.wuml.rbac.entity.SysUserEntity;
import top.wuml.security.user.UserDetail;

@Mapper
public interface SysUserConvert {
   SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);
   UserDetail convertDetail(SysUserEntity sysUserEntity);

}
