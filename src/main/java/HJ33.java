import java.util.Scanner;

public class HJ33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ipv4 = scanner.nextLine();
            //ip转10进制
            ipv4ToOct(ipv4);
            //十进制转ipv4
            String Oct = scanner.nextLine();
            octToIpv4(Oct);
        }
    }

    private static void ipv4ToOct(String ipv4) {
        String[] ipv4Arrays = ipv4.split("\\.");
        long result = 0;
        for (int i = 0; i < ipv4Arrays.length; i++) {
            result = result * 256 + Integer.parseInt(ipv4Arrays[i]);
        }
        System.out.println(result);
    }

    private static void octToIpv4(String oct) {
        StringBuilder result = new StringBuilder();
        long ipv4 = Long.parseLong(oct);
        for (int i = 0; i < 4; i++) {
            //result.append(ipv4 % 256).append(".").append(result);
            result.insert(0,".").insert(1,ipv4 % 256);
            ipv4 /= 256;
        }
        System.out.println(result.toString().substring(1,result.toString().length()));
    }
}
