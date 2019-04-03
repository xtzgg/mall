package com.mall.manager.product.repository;


import com.mall.manager.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
		//获取上线的商品
		List<ProductInfo> findByProductStatus(Integer status);
		List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
