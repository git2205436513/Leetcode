package 字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FJC
 * @date 2020/3/22-18:44
 */
/*
罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class 罗马数字转整数13 {
    // 思路 观察可以发现 小数值在大数值左边是相减，右边是相加
    public int romanToInt(String s) {
        // 初始化res 用于返回
        int res = 0;
        // 获取第一个值开始做判断
        int preNum = getValue(s.charAt(0));
        // 循环判断,因为第一个取了 所以从第二个开始取
        for(int i = 1; i< s.length();i++){
           int num = getValue(s.charAt(i));
           // 如果小于 减法
           if(preNum < num){
               res -= preNum;
           // 否则加法
           } else{
               res += preNum;
           }
           // 比较值后移
           preNum = num;
        }
        // 因为最后一个值不会进循环 所以外面加一下
        res +=preNum;

        return  res;
    }
    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
