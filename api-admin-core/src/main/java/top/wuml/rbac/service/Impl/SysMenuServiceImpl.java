package top.wuml.rbac.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.wuml.mybatis.service.Impl.BaseServiceImpl;
import top.wuml.rbac.dao.SysMenuDao;
import top.wuml.rbac.entity.SysMenuEntity;
import top.wuml.rbac.service.SysMenuService;


/**
 * 系统菜单业务实现类
 *
 * @author mqxu
 */
@Service
@AllArgsConstructor
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

}