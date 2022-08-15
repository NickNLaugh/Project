import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String str = Integer.toBinaryString(num);
            System.out.println(str.replaceAll("0", "").length());
        }
    }
}
