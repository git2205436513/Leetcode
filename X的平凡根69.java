/**
 * @author FJC
 * @date 2020/3/22-10:35
 */
/*
计算并返回 x 的平方根，其中 x 是非负整数。
由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class X的平凡根69 {
    // 二分查找 和 367很相似 不过多赘述了
    public int mySqrt(int x) {
        long left = 0;
        long right = x/2+1;
        while(left <= right){
            long mid = (right + left)/2;
            long res = mid * mid;
            if(res == x){
                return (int) mid;
            }else if(res < x){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return (int) right;
    }
}
