package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Classname: SetmealDishMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:33
 * @Version: v1.0
 */
@Mapper
public interface SetmealDishMapper {

    List<Long> getSetmealByDishIds(List<Long> dishIds);
}
