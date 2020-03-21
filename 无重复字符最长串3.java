/**
 * @author FJC
 * @date 2020/3/21-10:53
 */

import java.util.HashMap;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class 无重复字符最长串3 {
    public int lengthOfLongestSubstring(String s) {
        /**
         * 使用滑动窗口来求解
         * 首先创立一个map、确定长的ans值、字符串长度的n值
         */
        int ans = 0;
        int n = s.length();
        // k是字符  v是字符在字符串中的位置
        HashMap<Character, Integer> map = new HashMap<>();
        // i j 一个在前，一个在后，用来确定窗口大小，计算ans值
        for (int i = 0, j = 0; j < n; j++) {
            // 获取最新的值，用来比较是否重复
            char c = s.charAt(j);
            //重复则更新i 这是使用math是为了防止i左移
            //假如你直接map.get(c),在遇上abba时 a会产生左移
            if(map.containsKey(c)){
                i  =  Math.max(i,map.get(c));

            }
            //并更新ans值
            // 因为是求最长字串，所以使用Math.max函数
            // 因为i、j都是从零开始 但是没有说字符长为0的，所以要加1
            ans = Math.max(ans,j-i+1);
            // 插入值，因为j是从0开始 所以加一 原因是v为key在字符串中的位置
            map.put(c,j+1);
        }
        return ans;
    }
}
