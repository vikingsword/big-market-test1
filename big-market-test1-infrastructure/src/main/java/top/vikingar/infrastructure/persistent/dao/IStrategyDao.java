package top.vikingar.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.vikingar.infrastructure.persistent.po.Strategy;

import java.util.List;

/**
 * @author vikingar
 * @time 2024/7/12 11:18
 * @description
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

    Strategy queryTest();
}
