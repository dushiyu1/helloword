package ATM;

import java.util.Scanner;

public class Zhuce {
    public static String zhuce(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请确认密码");
            String okpassword = sc.next();

            if (password.equals(okpassword)){
                System.out.println("注册成功,用户名为:"+username);//缺少卡号
                break;
            }else{
                System.out.println("两次密码输入不一致,请重新输入");
            }


        }


        return null;
    }

}
