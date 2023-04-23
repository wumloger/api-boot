package top.wuml.rbac.query;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.wuml.common.query.Query;


/**
 * 登录日志查询参数
 *
 * @author mqxu
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "登录日志查询参数")
public class SysLogLoginQuery extends Query {

    @Schema(description = "用户名")
    private String username;


    @Schema(description = "登录地点")
    private String address;


    @Schema(description = "登录状态 0：失败  1：成功")
    private Integer status;
}
