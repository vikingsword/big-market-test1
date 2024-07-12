package top.vikingar.domain.strategy.service.impl;

import org.springframework.stereotype.Service;
import top.vikingar.domain.strategy.model.StrategyEntity;
import top.vikingar.domain.strategy.repo.IStrategyRepo;
import top.vikingar.domain.strategy.service.IStrategyService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/12 10:52
 * @description
 */
@Service
public class StrategyServiceImpl implements IStrategyService {

    @Resource
    private IStrategyRepo strategyRepo;

    @Override
    public List<StrategyEntity> queryStrategyList() {
        return strategyRepo.queryStrategyList();
    }

}
