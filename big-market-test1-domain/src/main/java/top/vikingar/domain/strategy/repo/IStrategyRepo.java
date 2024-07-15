package top.vikingar.domain.strategy.repo;

import top.vikingar.domain.strategy.model.StrategyAwardEntity;
import top.vikingar.domain.strategy.model.StrategyEntity;

import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/12 10:55
 * @description
 */
public interface IStrategyRepo {

    List<StrategyEntity> queryStrategyList();

    List<StrategyAwardEntity> getStrategyAwardEntity(Long strategyId);


}
