/**
 * @author FJC
 * @date 2020/3/21-10:36
 */

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
public class 两数之和1 {
    public int[] twoSum(int[] nums, int target) {
        //我们可以用两个for循环来解决问题，也可以用hash表来解决问题
        // 我们首先创建一个Hash表，按照循环往里填值
        //同时利用map的比较方法，若map中存在与target- nums【i】相等的值s
        // 则返还当前i和利用get获取s的下标


        //创建map
        HashMap<Integer, Integer> map = new HashMap<>();
        // 循环往里填值
        for (int i = 0; i <nums.length ; i++) {
            //判断是否相等
            if(map.containsKey(target-nums[i])){
                //相等通过get取值
                return  new int[]{i,map.get(target-nums[i])};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

}
