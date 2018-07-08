package cn.krynn.order.service.impl;

import cn.krynn.order.dataobject.OrderMaster;
import cn.krynn.order.dto.OrderDTO;
import cn.krynn.order.enums.OrderStatusEnum;
import cn.krynn.order.enums.PayStatusEnum;
import cn.krynn.order.repository.OrderDetailRepository;
import cn.krynn.order.repository.OrderMasterRepository;
import cn.krynn.order.service.OrderService;
import cn.krynn.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by RaistlinD
 * 2018/7/8 下午10:44
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        //TODO 查询商品信息（调用product服务）
        //TODO 计算总价
        //TODO 扣库存（调用product服务）

        //订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
