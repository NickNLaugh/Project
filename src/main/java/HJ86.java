import java.util.Scanner;

public class HJ86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] array = Integer.toBinaryString(scanner.nextInt()).split("0");
            int max = 0;
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i].length());
            }
            System.out.println(max);
        }
    }

}
