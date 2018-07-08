package cn.krynn.order.enums;

import lombok.Getter;

/**
 * Created by RaistlinD
 * 2018/7/8 下午11:10
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数错误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
