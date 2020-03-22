/**
 * @author FJC
 * @date 2020/3/22-11:03
 */
/*
给定一个整数数组 nums ，
找到一个具有最大和的连续子数组（子数组最少包含一个元素），
返回其最大和。
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 */
public class 最大子序和53 {
    public int maxSubArray(int[] nums) {
        //设立一个结果返回，一个中间值判断
        int res = nums[0];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            //如果temp>0 说明，它对结果是正向的，所以保留这个值
            if(temp > 0){
                // 保留值并相加
                temp += nums[i];
            }else{
                // 如果小于0 说明对结果是负向的，所以舍弃换新的值
                temp = nums[i];
            }
            // 比较当前的值 和 res的值 谁大就赋给res；
            res = Math.max(res,temp);
        }
        return  res;
    }
}
