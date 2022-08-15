import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 简单密码
 */
public class HJ21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            String[] alphabet = {"2abc", "3def", "4ghi", "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz"};
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    if (Character.isLowerCase(str.charAt(i))) {
                        for (int j = 0; j < alphabet.length; j++) {
                            if (alphabet[j].contains(str.charAt(i) + "")) {
                                result.append(alphabet[j].charAt(0));
                            }
                        }
                        continue;
                    }
                    if (str.charAt(i) == 'Z') {
                        result.append('a');
                        continue;
                    }
                    result.append(Character.toLowerCase((char) (str.charAt(i) + 1)));
                    continue;
                }
                result.append(str.charAt(i));
            }
            System.out.println(result.toString());
        }
    }
}
