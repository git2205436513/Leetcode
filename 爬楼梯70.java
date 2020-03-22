/**
 * @author FJC
 * @date 2020/3/21-19:14
 */
/**
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
注意：给定 n 是一个正整数。
 */
public class 爬楼梯70 {
    public int climbStairs(int n) {
        //斐波那契数列
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int m[] = new int[n+1];
        m[1] = 1;
        m[2] = 2;
        for (int i = 3; i <= n; i++) {
            m[i]=m[i-1]+m[i-2];
        }
        return m[n];

    }
}
