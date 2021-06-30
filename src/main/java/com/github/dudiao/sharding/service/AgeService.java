package com.github.dudiao.sharding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.dudiao.sharding.entity.Age;
import com.github.dudiao.sharding.entity.Order;
import java.util.List;

/**
 * @author clearlove
 * @ClassName AgeService.java
 * @Description
 * @createTime 2021年06月30日 23:45:00
 */
public interface AgeService extends IService<Age> {

    List<Age> getOrderByUser(long age);
}
