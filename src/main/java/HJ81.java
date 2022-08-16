import java.util.Scanner;

public class HJ81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            for (int i = 0; i < str1.length(); i++) {
                if (!str2.contains(str1.charAt(i)+"")) {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
        scanner.close();
    }
}
