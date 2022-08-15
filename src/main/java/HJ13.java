import java.util.Scanner;

/**
 * 句子逆序
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] strArray = scanner.nextLine().split(" ");
            for (int i = strArray.length - 1; i > -1; i--) {
                System.out.print(strArray[i]+" ");
            }
        }
    }
}
