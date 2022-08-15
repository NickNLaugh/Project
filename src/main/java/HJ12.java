import java.util.Scanner;

public class HJ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(new StringBuilder(str).reverse());
        }
    }
}
