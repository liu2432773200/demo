package com.webservice;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;

/**
 * 测试类
 * @author liu
 */
public class JTest {
    /**
     * 随机指定范围内N个不重复的数
     * 利用HashSet的特征，只能存放不同的值
     * @param min 指定范围最小值(包含)
     * @param max 指定范围最大值(不包含)
     * @param n 随机数个数
     * @param set 随机数结果集
     */
    public static void randomSet(int min, int max, int n, HashSet<Integer> set) throws Exception {
        if (n > (max - min) || max < min) {
            throw new  Exception("最大值、最小值或随机生成个数设置有误,请检查后再次执行！");
        }
        do{
            // 调用Math.random()方法
            int num = (int) (Math.random() * (max - min)) + min;
            // 将不同的数存入HashSet中
            set.add(num);
            System.out.println("setSize:"+set.size());
        }while (set.size()<n);
    }

    @Test
    public void test(){
        try {
            HashSet<Integer> set = new HashSet<Integer>();
            randomSet(90,100,10,set);
            for (int i : set) {
                System.out.println(i);
            }
            System.out.println("setSize:"+set.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
