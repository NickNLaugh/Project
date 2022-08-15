import java.util.*;

public class HJ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (scanner.hasNext()) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(scanner.next());
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        scanner.close();
    }
}
