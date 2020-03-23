/**
 * @author FJC
 * @date 2020/3/22-11:29
 */
/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
 */
public class 最长公共前缀14 {
    public String longestCommonPrefix(String[] strs) {
        //如果字符串数组为0 返回“”
        if(strs.length == 0 ){
            return "";
        }
        //如果只有一个  那么最长公共前缀为本身
        if(strs.length == 1){
            return strs[0];
        }
        // 假设 最长公共前缀为第一个
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            // 如果两个都为空 那么最长自然为空
            if(str.equals("") || res.equals("")){
                return "";
            }
            // 设定结束值,为零是一个都不匹配
            int end = 0;
            // end没有超过两个字符串的长度 且匹配 着end向后移动
            while(end < str.length()&& end < res.length()&& str.charAt(end) == res.charAt(end)){

                    end++;

            }
            //截取 0 到end 这一部分
        res = res.substring(0,end);
        }
      //返回
        return  res;
    }

}
