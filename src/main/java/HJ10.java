import java.util.Scanner;

/**
 * 字符个数统计
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder result = new StringBuilder();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (!result.toString().contains(str.charAt(i) + "")) {
                    result.append(str.charAt(i));
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
