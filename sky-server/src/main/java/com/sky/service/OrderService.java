package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;
import org.springframework.stereotype.Service;

/**
 * Classname: OrderService
 * Package: com.sky.service
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 10:49
 * @Version: v1.0
 */
@Service
public interface OrderService {
    /**
     * 用户下单
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}
