package henu.software.report2;

import javax.naming.ServiceUnavailableException;
import java.util.Scanner;

public class S2_1_1 {
    public static void main(String[] args) {
        //1.（1） 求任意输入n个数的和
        System.out.println("请输入若干个数，每输入一个数回车确认");
        System.out.println("最后输入数字0来结束操作");
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        do {
            n = scanner.nextInt();
            sum += n;
        }
        while (n != 0);
        System.out.println(sum);
    }
}
 class S2_1_2 {
    public static void main(String[] args) {
        //1.(2) 求三个整数中的最大值
        System.out.println("请输入三个整数");
        int a, b, c,max;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("最大值为"+max);
    }
}