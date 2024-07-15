package top.vikingar.domain.strategy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author vikingar
 * @time 2024/7/12 10:48
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StrategyEntity {

    private Long id;

    private Long strategyId;

    private String strategyDesc;

    private String ruleModels;

    private Date createTime;

    private Date updateTime;

}
