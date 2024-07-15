package top.vikingar.domain.strategy.service.impl;

import org.springframework.stereotype.Service;
import top.vikingar.domain.strategy.model.StrategyAwardEntity;
import top.vikingar.domain.strategy.model.StrategyEntity;
import top.vikingar.domain.strategy.repo.IStrategyRepo;
import top.vikingar.domain.strategy.service.IStrategyArmory;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/12 10:52
 * @description
 */
@Service
public class StrategyArmory implements IStrategyArmory {

    @Resource
    private IStrategyRepo strategyRepo;

    @Override
    public List<StrategyEntity> queryStrategyList() {
        return strategyRepo.queryStrategyList();
    }

    @Override
    public boolean assembleLotteryStrategy(Long strategyId) {

        // 1. 查询策略奖品实体
        List<StrategyAwardEntity> strategyAwardEntityList = strategyRepo.getStrategyAwardEntity(strategyId);

        // 2. 获取当前策略id的最小概率值

        // 3. 获取当前策略id下的所有概率值的和

        // 4. sum 除以 min 就是range，把range作为要填充数组的size

        // 5. 策略装配，概率*range是这个概率需要填充的数字

        // 6. 得到的list内容随机化

        // 7. list转化为map，存放到redis中

        return true;
    }

}
