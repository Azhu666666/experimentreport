package henu.software.report4;

public class S4_4 {

    public static void main(String[] args) {
        System.out.println("=== 宇宙飞船系统测试 ===\n");
        System.out.println("--- 创建货船（向上转型为 Spaceship） ---");
        Spaceship cargo = new CargoShip(4, 10);
        cargo.display();
        System.out.println("\n--- 创建战斗机（向上转型为 Spaceship） ---");
        Spaceship fighter = new FighterShip(6, 2);
        fighter.display();
        System.out.println("\n--- 飞船编队展示 ---");
        Spaceship[] fleet = new Spaceship[3];
        fleet[0] = new CargoShip(2, 5);
        fleet[1] = new FighterShip(8, 1);
        fleet[2] = new CargoShip(6, 20);
        for (int i = 0; i < fleet.length; i++) {
            System.out.print("飞船 " + (i + 1) + ": ");
            fleet[i].display();
        }

        System.out.println("\n=== 测试完成 ===");
    }
}
abstract class Spaceship {
    private int engineNum;
    private int crewCapacity;
    public Spaceship(int engineNum, int crewCapacity) {
        this.engineNum = engineNum;
        this.crewCapacity = crewCapacity;
    }
    public int getEngineNum() {
        return engineNum;
    }
    public int getCrewCapacity() {
        return crewCapacity;
    }
    public abstract void display();
}
class CargoShip extends Spaceship {

    public CargoShip(int engineNum, int crewCapacity) {
        super(engineNum, crewCapacity);
    }
    @Override
    public void display() {
        System.out.println("【货船】引擎数量：" + getEngineNum() + "，乘员容量：" + getCrewCapacity());
    }
}
class FighterShip extends Spaceship {
    public FighterShip(int engineNum, int crewCapacity) {
        super(engineNum, crewCapacity);
    }
    @Override
    public void display() {
        System.out.println("【战斗机】引擎数量：" + getEngineNum() + "，乘员容量：" + getCrewCapacity());
    }
}