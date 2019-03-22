package com.springboot.mybatis.util;

import java.util.Random;

/**
 * Created by 张文旭 on 2019/3/18.
 * 随机数工具类
 */
public class RandomUtil {
    public static String getRandomCode(){
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random(  );
        for(int i = 0;i<6;i++){
            //生成[0,bound)随机数
            int num = random.nextInt(10);

            stringBuffer.append( num );
        }
     return  stringBuffer.toString();
    }

}
