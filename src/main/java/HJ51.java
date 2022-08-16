import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(scanner.nextInt());
            }
            int target = scanner.nextInt();
            System.out.println(list.get(list.size() - target));
        }
    }
}
