import java.util.Scanner;

public class HJ32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int max = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = 2; j <= str.length(); j++) {
                    if (isValidSubing(str.substring(i, j))) {
                        max = Math.max(max, j - i);
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static boolean isValidSubing(String str) {
        char[] chs = str.toCharArray();
        int j = chs.length - 1;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] != chs[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
