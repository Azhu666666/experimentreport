package henu.software.report3;
public class S3_6 {
    static class Account {
        String account;
        String name;
        double balance;
        String password;
        boolean isLogin;
        public Account() {
        }
        public Account(String account, String name, double balance, String password) {
            this.account = account;
            this.name = name;
            this.balance = balance;
            this.password = password;
            this.isLogin = false;
        }
    }
    static class ATM {
        Account[] accounts;
        public void login(String account, String password) {
            for (Account acc : accounts) {
                if (acc.account.equals(account) && acc.password.equals(password)) {
                    System.out.println("登录成功！");
                    acc.isLogin = true;
                    return;
                }
            }
            System.out.println("登录失败！");
        }
        public void deposit(String account, double amount) {
            for (Account acc : accounts) {
                if (acc.account.equals(account) && acc.isLogin) {
                    acc.balance += amount;
                    System.out.println("存款成功！余额为：" + acc.balance);
                    return;
                }
            }
            System.out.println("请先登录！");
        }
        public void withdraw(String account, double amount) {
            for (Account acc : accounts) {
                if (acc.account.equals(account) && acc.isLogin) {
                    if (acc.balance >= amount) {
                        acc.balance -= amount;
                        System.out.println("取款成功！余额为：" + acc.balance);
                    } else {
                        System.out.println("余额不足！");
                    }
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.accounts = new Account[]{
                new Account("123456", "张三", 1000, "123456"),
                new Account("654321", "李四", 500, "654321")
        };
        atm.login("123456", "123456");
        atm.deposit("123456", 100);
        atm.withdraw("123456", 200);
        atm.login("654321", "654321");
        atm.withdraw("654321", 10000);
    }
}
