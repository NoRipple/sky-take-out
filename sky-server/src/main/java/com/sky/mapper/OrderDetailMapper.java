package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Classname: OrderDishMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 10:58
 * @Version: v1.0
 */
@Mapper
public interface OrderDetailMapper {
    /**
     * 批量插入订单
     * @param orderDetailList
     */
    void insertBatch(List<OrderDetail> orderDetailList);
}
