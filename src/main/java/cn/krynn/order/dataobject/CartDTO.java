package cn.krynn.order.dataobject;

import lombok.Data;

/**
 * Created by RaistlinD
 * 2018/7/14 上午9:42
 */
@Data
public class CartDTO {

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
