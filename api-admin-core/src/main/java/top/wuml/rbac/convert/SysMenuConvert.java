package top.wuml.rbac.convert;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.wuml.rbac.entity.SysMenuEntity;
import top.wuml.rbac.vo.SysMenuVO;


import java.util.List;

/**
 * 系统菜单实体转换
 *
 * @author moqi
 */
@Mapper
public interface SysMenuConvert {
    SysMenuConvert INSTANCE = Mappers.getMapper(SysMenuConvert.class);

    SysMenuEntity convert(SysMenuVO vo);

    SysMenuVO convert(SysMenuEntity entity);

    List<SysMenuVO> convertList(List<SysMenuEntity> list);

}
