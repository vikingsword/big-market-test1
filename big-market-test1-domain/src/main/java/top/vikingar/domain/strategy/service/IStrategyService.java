package top.vikingar.domain.strategy.service;

import top.vikingar.domain.strategy.model.StrategyEntity;

import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/12 11:53
 * @description
 */
public interface IStrategyService {

    List<StrategyEntity> queryStrategyList();

    boolean assembleLotteryStrategy(Long strategyId);
}
