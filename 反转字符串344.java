import sun.text.resources.cldr.es.FormatData_es_419;

/**
 * @author FJC
 * @date 2020/3/21-16:31
 */
/*
编写一个函数，其作用是将输入的字符串反转过来。
输入字符串以字符数组 char[] 的形式给出。
不要给另外的数组分配额外的空间，你必须原地修改输入数组、
使用 O(1) 的额外空间解决这一问题。
 */
public class 反转字符串344 {
    public void reverseString(char[] s) {
        // 交换数组ab编程了 交换字符ab而已
        int l = s.length - 1;
        for (int i = 0; i < l; i++) {
            char temp = s[i];
            s[i] = s[l];
            s[l] = temp;
            --l;

        }


    }
}
