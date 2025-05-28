package BT6_HT5;

public class Main {
    public static void main(String[] args) {
        IAnimal dog = new Dog();
        IAnimal cat = new Cat();
        IAnimal robot = new RobotAdapter(new Robot());

        System.out.println(dog.MakeSound());
        System.out.println(cat.MakeSound());
        System.out.println(robot.MakeSound());
    }
}
