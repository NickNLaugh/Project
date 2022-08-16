import java.util.Scanner;

public class HJ31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String pattern = "[^a-zA-Z]";
            String[] array = str.split(pattern);
            for (int i = array.length-1; i >= 0; i--) {
                System.out.print(array[i]+" ");
            }
        }
    }
}
