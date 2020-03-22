import java.util.Arrays;

/**
 * @author FJC
 * @date 2020/3/22-11:21
 */
public class 移动零283 {
    //给定一个数组 nums，编写一个函数将所有 0
    // 移动到数组的末尾，同时保持非零元素的相对顺序。
    public void moveZeroes(int[] nums) {
        // count用于计算0的个数
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // 有零则count++
            if(nums[i] == 0){
                count++;
            }else if(count > 0){
                //进入到这个循环说明nums【i】！=0 所以和前面的0调换位置
                nums[i - count] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
