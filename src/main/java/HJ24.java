import java.util.Scanner;

public class HJ24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] chs = new int[num];
            for (int i = 0; i < num; i++) {
                chs[i] = scanner.nextInt();
            }
            int[] lift = new int[num];
            int[] right = new int[num];
            lift[0] = 1;
            right[num - 1] = 1;
            //从下标1的位置开始求lift左边最大上升子序列，right最右最大递减右序列
            for (int i = 1; i < num; i++) {
                lift[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (chs[i] > chs[j]) {
                        lift[i] = Math.max(lift[i], lift[j] + 1);
                    }
                }
            }
            //从下标1的位置开始求lift左边最大上升子序列，right最右最大递减右序列
            for (int i = num - 2; i >= 0; i--) {
                right[i] = 1;
                for (int j = num - 1; j > i; j--) {
                    if (chs[j] < chs[i]) {
                        right[i] = Math.max(right[i], right[j] + 1);
                    }
                }
            }
            int result = Integer.MAX_VALUE;
            for (int i = 0; i < num; i++) {
                result = Math.min(result, num - (lift[i] + right[i] - 1));
            }
            System.out.println(result);
        }
    }
}
