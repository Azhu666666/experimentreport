package henu.software.report4;
public class S4_1 {
    public static void main(String[] args) {
        class Animal {
            private String name;
            private int age;
            private String species;
            private String habitat;
            public Animal(String name, int age, String species, String habitat) {
                this.name = name;
                this.age = age;
                this.species = species;
                this.habitat = habitat;
            }
            public String getName() {
                return name;
            }
            public void makeSound() {
                System.out.println("The " + species + " makes a sound.");
            }
            public void displayInfo() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Species: " + species);
                System.out.println("Habitat: " + habitat);
            }
            public void eat() {
                System.out.println("The " + species + " is eating.");
            }
        }
        class Monkey extends Animal {
            private String hobby;
            private float weight;
            public Monkey(String name, int age, String species, String habitat, String hobby, float weight) {
                super(name, age, species, habitat);
                this.hobby = hobby;
                this.weight = weight;
            }
            @Override
            public void makeSound() {
                System.out.println("The monkey says 'Ooh ooh ah ah'.");
            }
            @Override
            public void eat() {
                System.out.println("The monkey is eating bananas.");
            }
            public void climbTree() {
                System.out.println("The monkey " +getName() + " is climbing a tree.");
            }
            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Hobby: " + hobby);
                System.out.println("Weight: " + weight);
            }
        }
        Animal animal = new Animal("Dog", 5, "Mammal", "Land");
        Monkey monkey = new Monkey("Tom", 3, "Primary", "Jungle", "Playing", 5.0f);
        animal.displayInfo();
        monkey.displayInfo();
        animal.makeSound();
        animal.eat();
        monkey.makeSound();
        monkey.eat();
        monkey.climbTree();

    }
}
