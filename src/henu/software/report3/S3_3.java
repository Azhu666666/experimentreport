package henu.software.report3;
public class S3_3 {
    static class Employee {
        private int id;
        private String name;
        private int age;
        private String position;
        private String department;
        static int attendanceCount = 0;
        public Employee() {
            this.id = 0;
            this.name = "Unknown";
            this.age = 0;
            this.position = "Unknown";
            this.department = "Unknown";
        }
        public Employee(int id, String name, int age, String position, String department) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.position = position;
            this.department = department;
        }
        public void sign_in(String name) {
            attendanceCount++;
            System.out.println(name + " 已经签到， 当前共有" + attendanceCount + "人已签到。");
        }
        public void displayInfo() {
            System.out.println("编号：" + id);
            System.out.println("姓名：" + name);
            System.out.println("年龄：" + age);
            System.out.println("职务：" + position);
            System.out.println("部门：" + department);
        }
    }
    static class TestEmployee {
        public static void main(String[] args) {
            Employee employee1 = new Employee(1, "张三", 30, "程序员", "开发部");
            Employee employee2 = new Employee(2, "李四", 28, "设计师", "设计部");
            employee1.sign_in("张三");
            employee2.sign_in("李四");
            employee1.displayInfo();
            employee2.displayInfo();
        }
    }

}
