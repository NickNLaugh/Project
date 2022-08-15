import java.util.Scanner;

/**
 * 进制转换
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(Integer.parseInt(str.substring(2, str.length()), 16));
        }
    }
}
