package cn.krynn.order.exception;

/**
 * Created by RaistlinD
 * 2018/7/8 下午11:07
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
