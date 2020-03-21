/**
 * @author FJC
 * @date 2020/3/21-14:40
 */

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中，
 * A 的所有偶数元素之后跟着所有奇数元素。
 */
public class 按奇偶排序数组905 {
    public int[] sortArrayByParity(int[] A) {
        // 新建一个数组
        int array[] =  new int[A.length];
        int t = 0;
        // 第一次输出偶数
        for (int i = 0; i < A.length; ++i) {
            if(A[i] % 2 == 0){
                array[t] = A[i];
                ++t;
            }
        }
        //第二次输出奇数
        for (int i = 0; i < A.length; ++i) {
            if(A[i] % 2 != 0){
                array[t] = A[i];
                ++t;
            }
        }
        return  array;
    }
}
