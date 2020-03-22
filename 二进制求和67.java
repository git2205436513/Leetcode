import java.math.BigInteger;

/**
 * @author FJC
 * @date 2020/3/21-23:41
 */
public class 二进制求和67 {
    public String addBinary(String a, String b) {
        // 大数类BigInteger
        // 将二进制（raix：2）的字符a，b转化为十进制数
        BigInteger aNum =new BigInteger(a,2) ;
        BigInteger bNum =new BigInteger(b,2) ;
        //大数类加法
        BigInteger ans = aNum.add(bNum);
        // 将十进制的大数类转化为二进制字符串
        String strSum=ans.toString(2);
        return strSum;
    }
}
