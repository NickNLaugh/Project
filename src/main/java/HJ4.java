import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 字符串分隔
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine().toLowerCase();
            String target = sc.nextLine().toLowerCase();
            if (str.isEmpty()) {
                System.out.println(str);
                return;
            }
            //需要补充0的个数
            int num = str.length() % 8;
            String zeroModel = "00000000";
            if (num != 0) {
                str += zeroModel.substring(num);
            }
            for (int i = 0; i <= str.length() / 8; i++) {
                System.out.println(str.substring(i * 8, i * 8 + 8));
            }
        }
    }
}
