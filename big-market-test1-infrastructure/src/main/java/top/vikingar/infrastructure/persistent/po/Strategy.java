package top.vikingar.infrastructure.persistent.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author vikingar
 * @time 2024/7/12 10:48
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Strategy {

    private Long id;

    private Long strategyId;

    private String strategyDesc;

    private String ruleModels;

    private Date createTime;

    private Date updateTime;


}
