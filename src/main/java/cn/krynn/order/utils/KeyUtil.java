package cn.krynn.order.utils;

import java.util.Random;

/**
 * Created by RaistlinD
 * 2018/7/8 下午10:52
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式：时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
