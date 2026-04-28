package henu.software.report2;

import jdk.dynalink.beans.StaticClass;

public class S2_3_1 {
    //分别用do-while和for循环计算1+1/2!-1/3!+1/4!-1/5!…的前20项之和。
    public static void main(String[] args) {
        double sum = 1;
        int i = 2;
        do {
            sum += Math.pow(-1, i) / factorial(i);
            i++;
        } while (i <= 20);
        System.out.println(sum);
        sum = 1;
        for (i = 2; i <= 20; i++) {
            sum += Math.pow(-1, i) / factorial(i);
        }
        System.out.println(sum);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
class S2_3_2 {
    //假设乌龟走一段长为 100 米的上坡路，每小时向前走 4 米，又后滑 1 米，问一共要多少小时才能首次到达终点。
    static void main() {
        double distance = 100;
        double speed = 4;
        double slide = 1;
        double time = 0;
        while (distance > 0) {
            distance -= speed;
            time += 1;
            distance += slide;
        }
        System.out.println(time+"hours");
    }
}
class S2_3_3 {
    //微信中的一个问题：一筐鸡蛋，1个1个拿，正好拿完。
    //	     2个2个拿，还剩1个。
    //	     3个3个拿，正好拿完。
    //	     4个4个拿，还剩1个。
    //	     5个5个拿，还差1个。
    //	     6个6个拿，还剩3个。
    //	     7个7个拿，正好拿完。
    //	     8个8个拿，还剩1个。
    //	     9个9个拿，正好拿完。
    //   问筐里最少有多少鸡蛋？
    static void main() {
        for (int i = 1; ; i++) {
            if (  i % 5 == 2 && i % 6 == 3 && i % 7 == 0&&i%8==1  && i % 9 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
