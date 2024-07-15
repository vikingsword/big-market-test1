package top.vikingar.test.domain.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.vikingar.domain.strategy.service.IStrategyArmory;

import javax.annotation.Resource;

/**
 * @author vikingar
 * @time 2024/7/15 14:47
 * @description
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyAwardApiTest {

    @Resource
    private IStrategyArmory strategyArmory;


    @Test
    public void test_strategyArmory() {
        Long strategyId = 100002L;
        boolean success = strategyArmory.assembleLotteryStrategy(strategyId);
        log.info("结果： {}", success);
    }


}
