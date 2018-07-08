package cn.krynn.order.enums;

import lombok.Getter;

/**
 * Created by RaistlinD
 * 2018/7/8 下午9:52
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
