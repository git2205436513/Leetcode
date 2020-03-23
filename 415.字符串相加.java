/**
 * @author FJC
 * @date 2020/3/21-15:54
 */
/*
给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
不允许直接转化
 */
public class 字符串相加415 {
    public String addStrings(String num1, String num2) {
        // 模拟加法  遇到建议直接自闭
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            carry = tmp / 10;
            res.append(tmp % 10);
            i--; j--;
        }
        if(carry == 1){res.append(1); }
        return res.reverse().toString();
    }
}
