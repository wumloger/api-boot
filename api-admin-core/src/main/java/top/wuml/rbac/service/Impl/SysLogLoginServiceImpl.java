package top.wuml.rbac.service.Impl;


import org.springframework.stereotype.Service;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.rbac.dao.SysLogLoginDao;
import top.wuml.rbac.entity.SysLogLoginEntity;
import top.wuml.rbac.service.SysLogLoginService;


/**
 * 登录日志业务实现类
 *
 * @author mqxu
 **/
@Service
public class SysLogLoginServiceImpl extends BaseServiceImpl<SysLogLoginDao, SysLogLoginEntity> implements SysLogLoginService {

}

