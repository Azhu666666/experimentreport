package henu.software.report2;

import java.util.Scanner;

public class S2_5_1 {
    //定义一维数组并初始化，通过键盘任意输入一个数，查找该数是否存在（结果返回下标值）。
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.println("下标为" + i);
                return;
            }
        }
        System.out.println("不存在");

    }
}
class S2_5_2{
    //编写一个程序，将二维数组a转置后存入数组b（所谓转置就是行列互换）
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("原数组为");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("转置后的数组为");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
