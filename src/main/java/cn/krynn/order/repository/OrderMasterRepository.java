package cn.krynn.order.repository;

import cn.krynn.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by RaistlinD
 * 2018/7/8 下午9:42
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
