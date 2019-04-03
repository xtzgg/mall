package com.mall.manager.product.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecreaseStockInput {
		/**
		 * 商品id
		 */
		private String productId;
		/**
		 * 商品数量
		 */
		private Integer productQuantity;
}
