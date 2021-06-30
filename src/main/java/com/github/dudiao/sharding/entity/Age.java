package com.github.dudiao.sharding.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author clearlove
 * @ClassName Age.java
 * @Description
 * @createTime 2021年06月30日 22:53:00
 */
@Data
@TableName("age")
public class Age {

    private Integer id;
    private int age;
}
