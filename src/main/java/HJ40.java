import java.util.Scanner;

public class HJ40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int letterNum = 0;
            int space = 0;
            int digit = 0;
            int others = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    letterNum++;
                    continue;
                }
                if (Character.isWhitespace(str.charAt(i))) {
                    space++;
                    continue;
                }
                if (Character.isDigit(str.charAt(i))) {
                    digit++;
                    continue;
                }
                others++;
            }
            System.out.println(letterNum);
            System.out.println(space);
            System.out.println(digit);
            System.out.print(others);
        }
    }
}
