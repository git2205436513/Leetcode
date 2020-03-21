import sun.security.util.Length;

/**
 * @author FJC
 * @date 2020/3/21-10:21
 */
/*
    给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。
    给定的字符串只含有小写英文字母，并且长度不超过10000。
 */
public class 重复字符串459 {
    public boolean repeatedSubstringPattern(String s) {
            /** 假设字符串为abc S=abcabc 我们能看到abc移动的所有情况
                 cab bca 都存在于S中（去除头尾）
                那么我们只需要判断S中是否存在s就行即存在重复
             **/
            String S = s + s;
            //substring用于去除头尾 contains用于检测是否包含
            return S.substring(1, S.length()-1).contains(s);
    }
}
