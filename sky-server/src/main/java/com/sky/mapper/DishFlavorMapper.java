package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Classname: DishFlavorMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 17:25
 * @Version: v1.0
 */
@Mapper
public interface DishFlavorMapper {
    void insertBatch(List<DishFlavor> flavors);

    @Delete("delete from sky_take_out.dish_flavor where dish_id = #{dishId} ;")
    void deleteByDishId(Long dishId);

    void deleteByIds(List<Long> ids);

    @Select("select * from sky_take_out.dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
