import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HJ26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char[] chs = scanner.nextLine().toCharArray();
            //过滤出英文字母
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < chs.length; i++) {
                if (Character.isLetter(chs[i])) {
                    list.add(chs[i]);
                }
            }
            list.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1) - Character.toLowerCase(o2);
                }
            });
            //组装结果
            StringBuilder result = new StringBuilder();
            int j = 0;
            for (int i = 0; i < chs.length; i++) {
                if (Character.isLetter(chs[i])) {
                    result.append(list.get(j));
                    ++j;
                    continue;
                }
                result.append(chs[i]);
            }
            System.out.println(result.toString());
        }
    }
}
