import java.util.Scanner;

/**
 * 数字颠倒
 */
public class HJ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        String str=scanner.nextLine();
            for (int i = str.length()-1; i > -1; i--) {
                System.out.print(str.charAt(i));
            }
        }
        scanner.close();
    }
}
