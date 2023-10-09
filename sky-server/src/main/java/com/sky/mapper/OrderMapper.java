package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * Classname: OrderServiceMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 10:53
 * @Version: v1.0
 */
@Mapper
public interface OrderMapper {
    void insert(Orders orders);
}
