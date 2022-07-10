package ATM;

import java.util.Scanner;

public class Login {
    public static void login(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            int password = sc.nextInt();

            if (username.equals("dushiyu") && password == 123){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("用户名或密码错误,请重试");
                break;
            }
        }


    }
}
