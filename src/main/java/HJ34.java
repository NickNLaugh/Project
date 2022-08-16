import java.util.Arrays;
import java.util.Scanner;

public class HJ34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            char[] array = str.toCharArray();
            Arrays.sort(array);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                result.append(array[i]);
            }
            System.out.println(result.toString());
        }
    }
}
