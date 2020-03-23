package 数组;

/**
 * @author FJC
 * @date 2020/3/23-9:01
 */
/*
给定一个排序数组，你需要在 原地 删除重复出现的元素，
使得每个元素只出现一次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在 原地 修改输入数组
并在使用 O(1) 额外空间的条件下完成。
 */
public class 删除排序数组中的重复项26 {
    public int removeDuplicates(int[] nums) {
        //如果数组长度为0，1 必不可能重复，直接返回长度就是
        if(nums.length < 2){
            return nums.length;
        }
        //初始化一个int用于返回,这个i为慢指针，只当遇见不同数再动，用于统计不同
        int i = 0;
        // j 为快指针，用于比较数，所以一直要动
        for (int j = 0; j < nums.length; j++) {
            // 遇见不同 将其赋给i+1，这样i+1个为不重复的数
            if(nums[i] !=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
            // 往后比较不同的数
            j++;
        }
        //因为返回的是长度，i是下标，所以记得+1
        return i+1;
        
    }
}
