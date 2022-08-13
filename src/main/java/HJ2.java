import java.util.Locale;
import java.util.Scanner;

/**
 * 计算某字符出现次数
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine().toLowerCase();
            String target = sc.nextLine().toLowerCase();
            int count = str.length() - str.replace(target, "").length();
            System.out.println(count);
        }
    }
}
