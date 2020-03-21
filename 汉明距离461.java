/**
 * @author FJC
 * @date 2020/3/21-16:39
 */
/*
两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class 汉明距离461 {
    public int hammingDistance(int x, int y) {
        // 异或运算 相同为0  不同为1  使用bitCount函数计算1的个数即可
        return Integer.bitCount(x^y);
    }
}
