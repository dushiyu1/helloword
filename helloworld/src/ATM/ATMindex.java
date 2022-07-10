package ATM;

import java.util.Scanner;

public class ATMindex {
    public static void main(String[] args) {
        OUT:
        while (true){
            System.out.println("==============================首页============================");
            System.out.println("==========================请选择操作命令========================");
            System.out.println("==1.注册====2.登录====================================6.退出===");
            Scanner sc = new Scanner(System.in);
            int sc1 = sc.nextInt();
            switch (sc1){
                case 1:
                    System.out.println("==========================注册========================");
                    Zhuce.zhuce();
                    break;
                case 2:
                    System.out.println("==========================登录========================");
                    Login.login();
                    break;
                case 6:
                    System.out.println("======================程序已退出========================");
                    break OUT;
        }

        }
    }
}
