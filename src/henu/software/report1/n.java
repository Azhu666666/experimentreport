package henu.software.report1;

import java.util.Scanner;

public class n {
     static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        System.out.println(result);
        System.out.println(n+"的阶乘为："+result);
    }

}
