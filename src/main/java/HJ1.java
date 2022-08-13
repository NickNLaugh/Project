import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] inArray = input.split(" ");
            System.out.println(inArray[inArray.length - 1].length());
        }
    }
}
