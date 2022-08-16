import java.util.Scanner;

public class HJ84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String template = "[^A-Z]";
            System.out.println(str.replaceAll(template, "").length());
        }
    }

}
