package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShopppingCart();
}
