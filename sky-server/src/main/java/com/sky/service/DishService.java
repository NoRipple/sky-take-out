package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Classname: DishService
 * Package: com.sky.service
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 17:08
 * @Version: v1.0
 */
public interface DishService {
    /**
     * 新增菜品和口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    DishVO getByIdwithFlavor(Long id);
    /**
     * 修改菜品
     * @param dishDTO
     * @return
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 启用禁用菜品
     * @param status
     * @param id
     */
    void starOrStop(Integer status, Long id);
    /**
     * 条件查询菜品和口味
     * @param dish
     * @return
     */
    List<DishVO> listWithFlavor(Dish dish);

    /**
     * 根据分类id查询菜品
     * @param categoryId
     * @return
     */
    List<Dish> list(Long categoryId);
}
