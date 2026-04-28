package henu.software.report2;

import java.util.Scanner;

public class S2_4_1 {
    //编写程序找出两个分教最高的学生，提示输入学生的个数、每个学生的名字及其分数，最后显示获得最高分的学生和第二高分的学生。
    static void main() {
        int n;
        System.out.println("请输入学生人数");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的名字");
            names[i] = scanner.next();
            System.out.println("请输入第" + (i + 1) + "个学生的分数");
            scores[i] = scanner.nextInt();
        }
        int max = scores[0], secondMax = 0;
        String maxName = names[0], secondMaxName = "";
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) {
                secondMax = max;
                secondMaxName = maxName;
                max = scores[i];
                maxName = names[i];
            } else if (scores[i] > secondMax) {
                secondMax = scores[i];
                secondMaxName = names[i];
            }
        }
        System.out.println("最高分是" + maxName + "，分数是" + max);
        System.out.println("第二高分是" + secondMaxName + "，分数是" + secondMax);
    }
}
class S2_4_2{
    //定义求最大值的方法，分别求两个整数，两个小数，三个小数的最大值。
    static void main() {
        System.out.println("请输入两个整数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("两个整数的最大值为" + maxInt(a, b));
        System.out.println("请输入两个小数");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        System.out.println("两个小数的最大值为" + maxDouble(c, d));
        System.out.println("请输入三个小数");
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        double g = scanner.nextDouble();
        System.out.println("三个小数最大值为" + maxMutiDouble(e, f, g));
    }
    static int maxInt(int a, int b) {
        return a > b ? a : b;
    }
    static double maxDouble(double a, double b) {
        return a > b ? a : b;
    }
    static double maxMutiDouble(double a, double b, double c) {
        return maxDouble(maxDouble(a, b), c);
    }
}
