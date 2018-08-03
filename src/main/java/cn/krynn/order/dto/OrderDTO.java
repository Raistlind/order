package cn.krynn.order.dto;

import cn.krynn.order.dataobject.OrderDetail;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by RaistlinD
 * 2018/7/8 下午10:37
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}
