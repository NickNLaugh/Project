import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HJ80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Set<Long> set = new TreeSet<>();
            int num1 = scanner.nextInt();
            for (int i = 0; i < num1; i++) {
                set.add(scanner.nextLong());
            }
            int num2 = scanner.nextInt();
            for (int i = 0; i < num2; i++) {
                set.add(scanner.nextLong());
            }
            for (Long num : set) {
                System.out.print(num);
            }
            scanner.close();
        }
    }
}
