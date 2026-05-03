package henu.software.report3;

public class S3_2 {
    public static void main(String[] args) {
        MonkeyAssistant assistant1=new MonkeyAssistant();
        MonkeyAssistant assistant2=new MonkeyAssistant("皮皮",2,48.0);
        assistant1.printDetails();
        assistant2.printDetails();
        assistant1.climbTree();
        assistant2.climbTree();
        System.out.println("摄氏度37.0°C对应的华氏度是："+assistant1.celsiusToFahrenheit(37.0));
        System.out.println("华氏度37.0°F对应的摄氏度是："+assistant1.fahrenheitToCelsius(37.0));
        assistant2.setTemperature(37.0);
        System.out.println("摄氏度37.0°C对应的华氏度是："+assistant2.celsiusToFahrenheit(37));
        System.out.println("华氏度37.0°F对应的摄氏度是："+assistant2.fahrenheitToCelsius(37));
    }
    static class MonkeyAssistant{
        String name;
        int age;
        double weight;
        String hobby;
        double temperature;
        public MonkeyAssistant(){
            this.name="无名氏";
            this.age=0;
            this.weight=0.0;
            this.hobby="无";
            this.temperature=0.0;
        }
        public MonkeyAssistant(String name,int age,double weight){
            this.name=name;
            this.age=age;
            this.weight=weight;
            this.hobby="无";
            this.temperature=0.0;
        }
        public void printDetails(){
            System.out.println("名字："+this.name);
            System.out.println("年龄："+this.age);
            System.out.println("体重："+this.weight);
            System.out.println("爱好："+this.hobby);
        }
        public void climbTree(){
            System.out.println("Monkey "+this.name+" is climbing a tree.");
        }
        public void setTemperature(double temperature){
            this.temperature=temperature;
        }
        public double celsiusToFahrenheit(double celsius){
            return celsius*1.8+32;
        }
        public double celsiusToFahrenheit(int celsius){
            return celsius*1.8+32;
        }
        public double fahrenheitToCelsius(double fahrenheit){
            return (fahrenheit-32)/1.8;
        }
        public double fahrenheitToCelsius(int fahrenheit){
            return (fahrenheit-32)/1.8;
        }
    }
}