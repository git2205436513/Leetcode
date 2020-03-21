/**
 * @author FJC
 * @date 2020/3/21-14:52
 */
/*
给定一个正整数 num，编写一个函数，
如果 num 是一个完全平方数，则返回 True，否则返回 False。
 */
public class 有效的完全平方数367 {
    public boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long left = 2;
        long right = num/2;
        long mid;
        while(left <= right){
            mid = (left + right) / 2;
            if((mid * mid) < num){
                left = mid + 1;
            }else if ((mid * mid) > num){
                right = mid -1;
            }else{
                return true;
            }
        }
        return false;
    }
}
