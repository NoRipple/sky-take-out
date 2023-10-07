package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import com.sky.service.ShoppingCartService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Classname: ShoppingCartMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 21:55
 * @Version: v1.0
 */
@Mapper
public interface ShoppingCartMapper {



    /**
     * 动态条件查询
     * @param shoppingCart
     * @return
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);

    /**
     * 根据id修改商品数量
     * @param shoppingCart
     */
    @Update("update sky_take_out.shopping_cart set number = #{number} where id = #{id}")
    void updateById(ShoppingCart shoppingCart);

    /**
     * 插入购物车数据
     * @param shoppingCart
     */
    @Insert("insert into sky_take_out.shopping_cart(name, user_id, dish_id, setmeal_id, dish_flavor, number, amount, image, create_time) " +
            "values (#{name},#{userId},#{dishId},#{setmealId},#{dishFlavor},#{number},#{amount},#{image},#{createTime})")
    void insert(ShoppingCart shoppingCart);
}
