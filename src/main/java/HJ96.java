import java.util.Scanner;

public class HJ96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String template1 = "[0-9]";
            String template2 = "[^0-9]";
            String[] strArray = str.split(template1);
            String[] numsArray = str.split(template2);
            StringBuilder result = new StringBuilder();
            int j = 0;
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].isEmpty()) {
                    continue;
                }
                result.append(strArray[i]);
                while (j < numsArray.length) {
                    if (numsArray[j].isEmpty()) {
                        continue;
                    }
                    result.append("*").append(numsArray[i]).append("*");
                    j++;
                    break;
                }
            }
            System.out.println(result.toString());
        }
    }
}
