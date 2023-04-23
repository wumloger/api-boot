package top.wuml.rbac.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户修改密码vo
 *
 * @author mqxu
 */
@Data
@Schema(description = "用户修改密码")
public class SysUserPasswordVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "原密码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "原密码不能为空")
    private String oldPassword;

    @Schema(description = "新密码，密码长度为 4-20 位", requiredMode = Schema.RequiredMode.REQUIRED)
    @Length(min = 4, max = 20, message = "新密码长度为 4-20 位")
    private String newPassword;

}
