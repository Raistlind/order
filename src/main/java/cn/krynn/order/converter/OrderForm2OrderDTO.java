package cn.krynn.order.converter;

import cn.krynn.order.dataobject.OrderDetail;
import cn.krynn.order.dto.OrderDTO;
import cn.krynn.order.form.OrderForm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RaistlinD
 * 2018/7/8 下午11:14
 */
public class OrderForm2OrderDTO {

    public static OrderDTO convert(OrderForm orderForm) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();


    }
}
