package cn.krynn.order.VO;

import lombok.Data;

/**
 * Created by RaistlinD
 * 2018/7/8 下午11:37
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private  T data;

}
