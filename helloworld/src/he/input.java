package he;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        String[] name1 = {"黄舒婷","邱明月","向玉梅"};
        for (int i = 0; i < name1.length; i++) {
            System.out.println(name1[i]);
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = sc.next();
        System.out.println("欢迎"+name);
        System.out.println("请输入你的年龄");
        int i = sc.nextInt();
        System.out.println("你的年龄是"+i);

        switch (i){
            case 20:
                System.out.println("你真年轻");
                break;

            case 30:
                System.out.println("你还年轻");
                break;

            case 40:
                System.out.println("你不年轻");
                break;
            default:
                System.out.println("不知道怎么说");
                break;

        }
    }
}
