import java.util.Scanner;

/**
 * 进制转换
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(Integer.parseInt(str.substring(2, str.length()), 16));
        }
    }

    public static class HJ6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                long num = sc.nextLong();
                System.out.println(getPrimeFactor(num).isEmpty() ? num : getPrimeFactor(num));
            }
            sc.close();
        }

        private static String getPrimeFactor(long num) {
            StringBuilder result = new StringBuilder();
            int times = (int) Math.sqrt(num);
            for (int i = 2; i <= times; i++) {
                while (i <= num) {
                    if (num % i == 0) {
                        result.append(i).append(" ");
                        num /= i;
                        continue;
                    }
                    break;
                }
            }
            return result.toString();
        }
    }
}
