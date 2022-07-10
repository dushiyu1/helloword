package Case;

import java.util.Scanner;

public class buyPlaneTick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double money = sc.nextDouble();

        System.out.println("请输入当前月份");
        int month = sc.nextInt();

        System.out.println("请输入座位类型");
        String type = sc.next();

        double newmoney = calc(money,month,type);
        System.out.println("新机票价格为:"+newmoney+"元");

    }

    public static double calc(double money, int month, String type) {
        if (1 <= month && month <= 6) {
            switch (type) {
                case "头等舱":
                    money = money * 0.9;
                    break;
                case "经济舱":
                    money = money * 0.8;
                    break;
                default:
                    money = -1;
                    break;
            }
        } else if (7 <= month && month <= 12) {
            switch (type){
                case "头等舱":
                    money = money * 0.7;
                    break;
                case "经济舱":
                    money = money * 0.6;
                    break;
                default:
                    money = -1;
                    break;
            }
        }
        return money;
    }
}
