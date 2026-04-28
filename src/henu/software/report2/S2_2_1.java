package henu.software.report2;

import java.util.Scanner;

public class S2_2_1 {
    public static void main(String[] args) {
        //2.(1) 实现会员注册，要求用户名字长度不小于3，密码长度不小于6，若不满足需有提示信息，提示输入有错误，注册时两次输入密码需要一致
        String username;
        String password;
        String confirmpassword;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 会员注册系统 ===");
        while (true) {
            System.out.println("请输入用户名（长度>=3）");
            username = scanner.nextLine().trim();
            if (username.length() < 3) {
                System.out.println("提示：用户名长度不得小于3，请重新输入！");
                continue;
            }
            System.out.println("请输入密码（长度>=6");
            password = scanner.nextLine().trim();
            if (password.length() < 6) {
                System.out.println("提示：密码长度不得小于6，请重新输入！");
                continue;
            }
            System.out.println("请再输入密码");
            confirmpassword = scanner.nextLine().trim();
            if (!password.equals(confirmpassword)) {
                System.out.println("提示：两次密码输入不同，请重新输入");
                continue;
            }
            System.out.println("注册成功！欢迎你 " + username);
            break;
        }
    }
}
class S2_2_2 {
    //2.（2） 用户输入自己的出生年份，程序输出其属相。分析：出生年份除以12得到余数。
    public static void main(String[] args) {
        int birthyear;
        System.out.println("请输入您的出生年份");
        Scanner scanner=new Scanner(System.in);
        String animal;
        birthyear=scanner.nextInt();
        int n=birthyear%12;
        switch (n)
        {
            case 0:animal="猴";break;
            case 1:animal="鸡";break;
            case 2:animal="狗";break;
            case 3:animal="猪";break;
            case 4:animal="鼠";break;
            case 5:animal="牛";break;
            case 6:animal="虎";break;
            case 7:animal="兔";break;
            case 8:animal="龙";break;
            case 9:animal="蛇";break;
            case 10:animal="马";break;
            case 11:animal="羊";break;
            default:animal="";break;
        };
        System.out.println("您的属相是"+animal);
    }
}
class S2_2_3 {
    //输入年份和月份，输出该年月的天数
    public static void main(String[] args) {
        int year,month;
        System.out.println("请输入年份");
        Scanner scanner=new Scanner(System.in);
        year=scanner.nextInt();
        System.out.println("请输入月份");
        month=scanner.nextInt();
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                if ((year%4==0&&year%100!=0)||year%400==0)
                    System.out.println("29天");
                else
                    System.out.println("28天");
        }
    }
}
class S2_2_4 {
    //（4）出租车计费问题。
    //开封市的出租车计费方式为：起步2公里内5元，2公里以上每公里收费1.3元，9公里以上每公里收费2元，燃油附加费1元。
    public static void main(String[] args) {
        double distance;
        System.out.println("请输入距离");
        Scanner scanner=new Scanner(System.in);
        distance=scanner.nextDouble();
        if (distance<=2)
            System.out.println("5元");
        else if(distance>2&&distance<=9)
            System.out.println((distance-2)*1.3+5);
        else
            System.out.println((distance-9)*2+5+9.1+1);

    }
}


