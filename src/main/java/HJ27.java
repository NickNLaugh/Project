import java.util.*;

public class HJ27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] chs = new String[n];
            for (int i = 0; i < n; i++) {
                chs[i] = scanner.next();
            }
            String x = scanner.next();
            int k = scanner.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < chs.length; i++) {
                if (chs[i].length() != x.length() || x.equals(chs[i])) {
                    continue;
                }
                char[] tmps = chs[i].toCharArray();
                char[] xs = x.toCharArray();
                Arrays.sort(tmps);
                Arrays.sort(xs);
                if (new String(tmps).equals(new String(xs))) {
                    list.add(chs[i]);
                }
            }
            Collections.sort(list);
            System.out.println(list.size());
            if (list.size()>=k) {
                System.out.println(list.get(k-1));
            }
            return;
        }
    }
}
