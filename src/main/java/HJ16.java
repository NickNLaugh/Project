import java.util.Scanner;

/**
 * 购物单
 */
public class HJ16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //获取钱数
            int money = scanner.nextInt();
            //获取可购买的物品
            int amount = scanner.nextInt();
            int[][] goods = new int[amount + 1][3];
            int[][] importance = new int[amount + 1][3];
            for (int i = 1; i <= amount; i++) {
                //价格
                int v = scanner.nextInt();
                //物品的重要度
                int p = scanner.nextInt();
                //所属主件编号
                int q = scanner.nextInt();
                if (q == 0) {
                    goods[i][0] = v;
                    importance[i][0] = p * v;
                } else if (goods[q][1] == 0) {
                    //附件1
                    goods[q][1] = v;
                    importance[q][1] = p * v;
                } else {
                    //附件2
                    goods[q][2] = v;
                    importance[q][2] = p * v;
                }
            }
            int[][] result = new int[money + 1][amount + 1];
            for (int i = 1; i <= amount; i++) {
                for (int j = money; j >= 10; j--) {
                    //主件价格
                    //主件钱数及性价比
                    int principalpart_value = goods[i][0];
                    int principalpart_cp = importance[i][0];
                    //附件1钱数及性价比
                    int tack_1_value = goods[i][1];
                    int tack_1_cp = importance[i][1];
                    //附件2钱数及性价比
                    int tack_2_value = goods[i][2];
                    int tack_2_cp = importance[i][2];
                    //只买主件
                    result[j][i] = j - principalpart_value >= 0 ? Math.max(result[j][i - 1], result[j - principalpart_value][i - 1] + principalpart_cp) : result[j][i - 1];
                    //主件+附件1
                    result[j][i] = j - principalpart_value - tack_1_value >= 0 ? Math.max(result[j][i], result[j - principalpart_value - tack_1_value][i - 1] + principalpart_cp + tack_1_cp) : result[j][i];
                    //主件+附件2
                    result[j][i] = j - principalpart_value - tack_2_value >= 0 ? Math.max(result[j][i], result[j - principalpart_value - tack_2_value][i - 1] + principalpart_cp + tack_2_cp) : result[j][i];
                    //主件+附件1+附件2
                    result[j][i] = j - principalpart_value - tack_1_value - tack_2_value >= 0 ? Math.max(result[j][i], result[j - principalpart_value - tack_2_value - tack_1_value][i - 1] + principalpart_cp + tack_2_cp + tack_1_cp) : result[j][i];

                    //只买主件
                    result[j][i] = j - principalpart_value >= 0 ? Math.max(result[j][i - 1], result[j - principalpart_value][i - 1] + principalpart_cp) : result[j][i - 1];
                    result[j][i] = j - principalpart_value - tack_1_value >= 0 ? Math.max(result[j][i], result[j - principalpart_value - tack_1_value][i - 1] + principalpart_cp + tack_1_cp) : result[j][i];
                    result[j][i] = j - principalpart_value - tack_2_value >= 0 ? Math.max(result[j][i], result[j - principalpart_value - tack_2_value][i - 1] + principalpart_cp + tack_2_cp) : result[j][i];
                    result[j][i] = j - principalpart_value - tack_1_value - tack_2_value >= 0 ? Math.max(result[j][i], result[j - principalpart_value - tack_1_value - tack_2_value][i - 1] + principalpart_cp + tack_1_cp + tack_2_cp) : result[j][i];
                }
            }
            System.out.println(result[money][amount]);
        }
    }
}
