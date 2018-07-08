package cn.krynn.order.service;

import cn.krynn.order.dto.OrderDTO;

/**
 * Created by RaistlinD
 * 2018/7/8 下午10:35
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
