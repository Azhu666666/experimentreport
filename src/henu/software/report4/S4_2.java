
package henu.software.report4;
    public class S4_2 {
        //2、定义一个类，
        // 在类中声明成员变量和成员方法，尝试使用final关键词修饰类中的变量、方法及该类，
        // 测试并查看结果，必要时加以注释。（练习目标：final关键字的应用）
        public static void main(String[] args) {
            Test obj = new Test();
            // 测试 final 变量
            System.out.println("常量 PI = " + obj.PI);
            System.out.println("常量 MAX = " + Test.MAX);
            // obj.PI = 3.0;  //  错误：final 变量不能修改
            // 测试 final 方法
            obj.show();
            // 测试 final 类
            FinalDemo demo = new FinalDemo();
            demo.print();
            // class Sub extends FinalDemo {}  // ❌ 错误：final 类不能继承
        }
    }
    class Test {
        final double PI = 3.14159;  // final 修饰变量：值不能修改
        static final int MAX = 100;  // static final：常量
        final void show() {  // final 修饰方法：不能被子类重写
            System.out.println("这是 final 方法");
        }
        void normal() {
            System.out.println("普通方法");
        }
    }
    final class FinalDemo {  // final 修饰类：不能被继承
        void print() {
            System.out.println("这是 final 类");
        }
    }

