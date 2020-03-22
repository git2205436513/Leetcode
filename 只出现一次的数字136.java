import java.util.HashMap;
import java.util.HashSet;

/**
 * @author FJC
 * @date 2020/3/21-19:23
 */
public class 只出现一次的数字136 {
    public int singleNumber(int[] nums) {
        // 创建一个map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 如果map中值存在则移除
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else {
                // 否者添加
                map.put(nums[i],1);
            }
        }
        // 取除map最后的一个key 返回
        for (int integer : map.keySet()) {
            return integer;
        }
        return -1;

    }
}