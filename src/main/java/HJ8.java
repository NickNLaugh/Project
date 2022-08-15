import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 合并表记录
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNext()) {
            Integer k = sc.nextInt();
            int value = sc.nextInt();
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + value);
            } else {
                map.put(k, value);
            }
        }
        for (Map.Entry<Integer, Integer> entey : map.entrySet()) {
            System.out.println(entey.getKey() + " " + map.get(entey.getKey()));
        }
    }
}
