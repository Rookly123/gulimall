package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author agenda
 * @email www.zyxx065@qq.com
 * @date 2022-10-10 23:40:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
