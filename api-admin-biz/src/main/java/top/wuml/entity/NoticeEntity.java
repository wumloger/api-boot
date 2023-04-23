package top.wuml.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.wuml.mybatis.entity.BaseEntity;


/**
 * notice 实体类
 *
 * @author mqxu
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_notice")
public class NoticeEntity extends BaseEntity {
    /**
     * 通知标题
     */
    private String title;
    /**
     * 通知内容
     */
    private String content;
}

