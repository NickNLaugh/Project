import java.util.Scanner;

public class HJ56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long num = scanner.nextLong();
            int count = 0;
            for (int i = 5; i <= num; i++) {
                long sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
