package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import org.springframework.stereotype.Service;

/**
 * Classname: ShopingCartService
 * Package: com.sky.service
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 21:45
 * @Version: v1.0
 */
@Service
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCartDTO(ShoppingCartDTO shoppingCartDTO);
}
