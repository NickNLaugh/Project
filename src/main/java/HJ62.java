import java.util.Scanner;

public class HJ62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(Integer.toBinaryString(num).replaceAll("0", "").length());
        }
    }
}
