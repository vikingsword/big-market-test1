package top.vikingar.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.vikingar.infrastructure.persistent.po.StrategyAward;

import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/15 10:57
 * @description
 */
@Mapper
public interface IStrategyAwardDao {


    List<StrategyAward> queryStrategyAward(Long strategyId);

}
