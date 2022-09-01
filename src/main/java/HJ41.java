import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HJ41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] eights = new int[num];
            int[] count = new int[num];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < num; i++) {
                eights[i] = scanner.nextInt();
            }
            for (int i = 0; i < num; i++) {
                count[i] = scanner.nextInt();
            }
            for (int i = 0; i < num; i++) {
                ArrayList<Integer> list = new ArrayList<>(set);
                for (int j = 1; j <= count[i]; j++) {
                    for (int k = 0; k < list.size(); k++) {
                        set.add(list.get(k) + eights[i] * j);
                    }
                }
            }
            System.out.println(set.size());
        }
    }
}
