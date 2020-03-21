/**
 * @author FJC
 * @date 2020/3/21-17:36
 */
public class 回文数9 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }
}
