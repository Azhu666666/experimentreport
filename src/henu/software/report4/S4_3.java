package henu.software.report4;

import java.util.Random;

    public class S4_3 {
        //在一个俱乐部里，会员每个月需要支付一定的会费（假设为1500元）。
        //而俱乐部的工作人员则每月会获得一份工资（随机生成，范围在1000到3000元之间）。
        //有一种特殊的角色叫做"兼职员工"，他们既是俱乐部的会员，也是工作人员。
        //因此，兼职员工既有工资收入，也需要支付会费。
        //兼职员工的净收入为（工资 - 会费），如果兼职员工的工资不足以支付会费，请输出一句鼓励的话："加油干吧！"
        //根据题意，请设计一个java程序，定义相应的类，实例化对象并调用相应的方法完成程序功能。
        //思考：如果使用抽象类，是否能完成程序中要求的功能？

        public static void main(String[] args) {

            // 1. 测试普通会员
            System.out.println("--- 普通会员 ---");
            Member member = new Member("张三");
            member.payFee();
            member.showNetIncome();

            // 2. 测试普通工作人员
            System.out.println("\n--- 普通工作人员 ---");
            Staff staff = new Staff("李四");
            staff.receiveSalary();
            staff.showNetIncome();

            // 3. 测试兼职员工
            System.out.println("\n--- 兼职员工 ---");
            PartTimeEmployee partTime1 = new PartTimeEmployee("王五", 2500);
            partTime1.showDetail();
            partTime1.showNetIncome();

            PartTimeEmployee partTime2 = new PartTimeEmployee("赵六", 1200);
            partTime2.showDetail();
            partTime2.showNetIncome();

            System.out.println("\n=== 测试完成 ===");
        }
    }

    abstract class ClubMember {
        protected String name;
        protected final double FEE = 1500;  // 会费（常量）

        public ClubMember(String name) {
            this.name = name;
        }

        // 抽象方法：获取收入
        public abstract double getIncome();

        // 抽象方法：获取支出
        public abstract double getExpense();

        // 具体方法：显示净收入
        public void showNetIncome() {
            double netIncome = getIncome() - getExpense();
            System.out.println(name + " 的净收入：" + String.format("%.2f", netIncome) + " 元");
            // 判断净收入是否小于0，并且是不是兼职员工，如果是，则输出鼓励
            if (netIncome < 0  && this instanceof PartTimeEmployee) {
                System.out.println(name + "，加油干吧！");
            }
        }

        // 抽象方法：显示角色信息（由子类实现）
        public abstract void showDetail();
    }

    // ========== 会员类 ==========
    class Member extends ClubMember {

        public Member(String name) {
            super(name);
        }

        @Override
        public double getIncome() {
            return 0;  // 会员没有收入
        }

        @Override
        public double getExpense() {
            return FEE;  // 支出是会费
        }

        @Override
        public void showDetail() {
            System.out.println(name + " 是普通会员");
            System.out.println("  - 收入：0 元");
            System.out.println("  - 支出：" + FEE + " 元（会费）");
        }

        public void payFee() {
            System.out.println(name + " 支付会费：" + FEE + " 元");
        }
    }

    // ========== 工作人员类 ==========
    class Staff extends ClubMember {
        private double salary;  // 工资

        public Staff(String name) {
            super(name);
            this.salary = generateSalary();
        }

        // 随机生成工资（1000-3000元）
        private double generateSalary() {
            Random random = new Random();
            return 1000 + random.nextDouble() * 2000;
        }

        @Override
        public double getIncome() {
            return salary;  // 收入是工资
        }

        @Override
        public double getExpense() {
            return 0;  // 工作人员没有支出
        }

        @Override
        public void showDetail() {
            System.out.println(name + " 是工作人员");
            System.out.println("  - 收入：" + String.format("%.2f", salary) + " 元（工资）");
            System.out.println("  - 支出：0 元");
        }

        public void receiveSalary() {
            System.out.println(name + " 获得工资：" + String.format("%.2f", salary) + " 元");
        }

        public double getSalary() {
            return salary;
        }
    }

    // ========== 兼职员工类 ==========
    class PartTimeEmployee extends ClubMember {
        private double salary;  // 工资

        public PartTimeEmployee(String name, double salary) {
            super(name);
            this.salary = salary;
        }

        @Override
        public double getIncome() {
            return salary;  // 收入是工资
        }

        @Override
        public double getExpense() {
            return FEE;  // 支出是会费
        }

        @Override
        public void showDetail() {
            double netIncome = getIncome() - getExpense();
            System.out.println(name + " 是兼职员工");
            System.out.println("  - 工资：" + String.format("%.2f", salary) + " 元");
            System.out.println("  - 会费：" + FEE + " 元");
            System.out.println("  - 净收入：" + String.format("%.2f", netIncome) + " 元");
        }
    }

