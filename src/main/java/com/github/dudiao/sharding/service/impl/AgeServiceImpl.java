package com.github.dudiao.sharding.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.dudiao.sharding.config.DataSourceConfiguration;
import com.github.dudiao.sharding.entity.Age;
import com.github.dudiao.sharding.entity.Order;
import com.github.dudiao.sharding.mapper.AgeMapper;
import com.github.dudiao.sharding.mapper.OrderMapper;
import com.github.dudiao.sharding.service.AgeService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author clearlove
 * @ClassName AgeServiceImpl.java
 * @Description
 * @createTime 2021年06月30日 23:46:00
 */
@Slf4j
@Service
public class AgeServiceImpl extends ServiceImpl<AgeMapper, Age> implements AgeService {


    @DS("s1")
    public List<Age> getOrderByUser(long age) {
        return baseMapper.selectList(Wrappers.<Age>lambdaQuery()
                .eq(Age::getAge, age));
    }

}
