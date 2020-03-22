import java.util.Scanner;

/**
 * @author FJC
 * @date 2020/3/21-16:24
 */
public class 输出ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
