package top.vikingar.infrastructure.persistent.repository;

import org.springframework.stereotype.Repository;
import top.vikingar.domain.strategy.model.StrategyAwardEntity;
import top.vikingar.domain.strategy.model.StrategyEntity;
import top.vikingar.domain.strategy.repo.IStrategyRepo;
import top.vikingar.infrastructure.persistent.dao.IStrategyAwardDao;
import top.vikingar.infrastructure.persistent.dao.IStrategyDao;
import top.vikingar.infrastructure.persistent.po.Strategy;
import top.vikingar.infrastructure.persistent.po.StrategyAward;
import top.vikingar.infrastructure.persistent.redis.IRedisService;
import top.vikingar.types.common.Constants;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vikingar
 * @time 2024/7/12 10:56
 * @description
 */
@Repository
public class StrategyRepo implements IStrategyRepo {

    @Resource
    private IRedisService redisService;

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyAwardDao strategyAwardDao;


    @Override
    public List<StrategyEntity> queryStrategyList() {
        List<Strategy> strategyList = strategyDao.queryStrategyList();
        return strategyList.stream().map(
                strategy -> StrategyEntity.builder()
                        .id(strategy.getId())
                        .strategyId(strategy.getId())
                        .strategyDesc(strategy.getStrategyDesc())
                        .ruleModels(strategy.getRuleModels())
                        .createTime(strategy.getCreateTime())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public List<StrategyAwardEntity> getStrategyAwardEntity(Long strategyId) {

//        // 从redis中查找
//        String cacheKey = Constants.RedisKey.STRATEGY_AWARD_KEY + strategyId;
//        List<StrategyAwardEntity> strategyAwardEntityList = redisService.getValue(cacheKey);
//
//        if (null != strategyAwardEntityList && !strategyAwardEntityList.isEmpty()) return strategyAwardEntityList;

        // 缓存中没有则从数据库中查找
        List<StrategyAward> strategyAwardEntities = strategyAwardDao.queryStrategyAward(strategyId);
        List<StrategyAwardEntity> strategyAwardEntityList = strategyAwardEntities.stream().map(
                strategyAward -> StrategyAwardEntity.builder()
                        .awardId(strategyAward.getAwardId())
                        .awardCount(strategyAward.getAwardCount())
                        .awardCountSurplus(strategyAward.getAwardCountSurplus())
                        .awardRate(strategyAward.getAwardRate())
                        .build()
        ).collect(Collectors.toList());

        return strategyAwardEntityList;
    }



}
