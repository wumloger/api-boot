package top.wuml.common.query;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * 公共查询参数封装
 *
 * @author mqxu
 */
@Data
public class Query {
    @NotNull(message = "页码不能为空")
    @Min(value = 1, message = "页码最小值为 1")
    @Schema(description = "当前页码", requiredMode = Schema.RequiredMode.REQUIRED)
    Integer page;

    @NotNull(message = "每页条数不能为空")
    @Range(min = 1, max = 1000, message = "每页条数，取值范围 1-1000")
    @Schema(description = "每页条数", requiredMode = Schema.RequiredMode.REQUIRED)
    Integer limit;

    @Schema(description = "排序字段")
    String order;

    @Schema(description = "是否升序")
    boolean asc;
}
