import java.util.ArrayList;
import java.util.List;

/**
 * @author FJC
 * @date 2020/3/21-23:02
 */

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class 杨辉三角118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for(int i = 0; i < numRows; i++){
            List<Integer> array = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    array.add(1);
                }else{
                    array.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(array);
        }
        return ans;
    }
}
