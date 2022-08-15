import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            Map<Character, Integer> map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                    continue;
                }
                map.put(str.charAt(i), 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                min = Math.min(min, map.get(entry.getKey()));
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (min == entry.getValue()) {
                    str = str.replaceAll(entry.getKey() + "", "");
                }
            }
            System.out.println(str);
        }
    }
}
