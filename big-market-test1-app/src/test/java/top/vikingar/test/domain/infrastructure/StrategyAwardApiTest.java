package top.vikingar.test.domain.infrastructure;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.vikingar.domain.strategy.model.StrategyAwardEntity;
import top.vikingar.infrastructure.persistent.dao.IStrategyAwardDao;
import top.vikingar.infrastructure.persistent.po.StrategyAward;
import top.vikingar.infrastructure.persistent.repository.StrategyRepo;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author vikingar
 * @time 2024/7/15 11:11
 * @description
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyAwardApiTest {

    @Resource
    private StrategyRepo strategyRepo;

    @Test
    public void test_getStrategyAwardEntity() {
        Long strategyId = 100002L;

        List<StrategyAwardEntity> strategyAwardEntities = strategyRepo.getStrategyAwardEntity(strategyId);
        log.info("查询结果: {}", JSON.toJSON(strategyAwardEntities));
    }
}
