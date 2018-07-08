package cn.krynn.order.utils;

import cn.krynn.order.VO.ResultVO;

/**
 * Created by RaistlinD
 * 2018/7/8 下午11:39
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
