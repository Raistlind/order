package cn.krynn.order.repository;

import cn.krynn.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by RaistlinD
 * 2018/7/8 下午9:44
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
