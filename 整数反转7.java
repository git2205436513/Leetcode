/**
 * @author FJC
 * @date 2020//*3/21-11:40
 */
/**
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
例如 123 -> 321  -123 -> -321
注意溢出，溢出返回0
 */
public class 整数反转7 {
    public int reverse(int x) {
        //设立返回值
        int r = 0;
        while (x != 0) {
            // 对 10 取余
            int temp = x % 10 + r * 10;
            //如果溢出 那么还原后肯定与结果不相等
            if ((temp - x % 10) / 10 != r) {
                return 0;
            }
            r = temp;
            x /= 10;
        }
        return r;
    }
}
