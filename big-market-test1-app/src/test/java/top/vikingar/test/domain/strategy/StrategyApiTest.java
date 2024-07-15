package top.vikingar.test.domain.strategy;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.vikingar.domain.strategy.model.StrategyEntity;
import top.vikingar.domain.strategy.service.IStrategyArmory;
import top.vikingar.infrastructure.persistent.dao.IStrategyDao;
import top.vikingar.infrastructure.persistent.po.Strategy;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/12 11:45
 * @description
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyApiTest {


    @Resource
    private IStrategyArmory strategyService;

    @Resource
    private IStrategyDao IStrategyDao;

    @Test
    public void test_strategyService() {
        List<StrategyEntity> strategyEntities = strategyService.queryStrategyList();
        log.info("查询结果： {}", JSON.toJSON(strategyEntities));
    }

    @Test
    public void test_dao() {
        Strategy strategy = IStrategyDao.queryTest();
        System.out.println(JSON.toJSON(strategy));
    }
}
