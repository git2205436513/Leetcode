/**
 * @author FJC
 * @date 2020/3/22-0:06
 */
public class 加一66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            // 如果小于9 不需要进位直接加
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            //大于九进位，所以这位变成0
            digits[i] = 0;
        }
        //如果循环结束都还没有跳出 说明该数为999之类的数 所以数组长度+1且第一位为1
        int res[] = new int[digits.length + 1];
        res[0] = 1;
        return  res;
    }
}
