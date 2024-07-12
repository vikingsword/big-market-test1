package top.vikingar.infrastructure.persistent.repository;

import org.springframework.stereotype.Repository;
import top.vikingar.domain.strategy.model.StrategyEntity;
import top.vikingar.domain.strategy.repo.IStrategyRepo;
import top.vikingar.infrastructure.persistent.dao.IStrategyDao;
import top.vikingar.infrastructure.persistent.po.Strategy;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/12 10:56
 * @description
 */
@Repository
public class StrategyRepo implements IStrategyRepo {

    @Resource
    private IStrategyDao strategyDao;

    @Override
    public List<StrategyEntity> queryStrategyList() {
        List<StrategyEntity> strategyEntityArrayList = new ArrayList<>();
        List<Strategy> strategyList = strategyDao.queryStrategyList();
        for (Strategy strategy : strategyList) {
            StrategyEntity strategyEntity = StrategyEntity.builder()
                        .id(strategy.getId())
                        .strategyId(strategy.getStrategyId())
                        .strategyDesc(strategy.getStrategyDesc())
                        .ruleModels(strategy.getRuleModels())
                        .createTime(strategy.getCreateTime())
                        .build();
            strategyEntityArrayList.add(strategyEntity);
        }
        return strategyEntityArrayList;
    }
}
