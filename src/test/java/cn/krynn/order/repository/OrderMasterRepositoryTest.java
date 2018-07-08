package cn.krynn.order.repository;

import cn.krynn.order.OrderApplicationTests;
import cn.krynn.order.dataobject.OrderMaster;
import cn.krynn.order.enums.OrderStatusEnum;
import cn.krynn.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by RaistlinD
 * 2018/7/8 下午9:45
 */
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("Raistlin");
        orderMaster.setBuyerPhone("18198928495");
        orderMaster.setBuyerAddress("shenzhen");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

}