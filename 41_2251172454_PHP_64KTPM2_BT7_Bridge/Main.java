package ANBridge;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(new BarkSound());
        System.out.println(dog.speak());
        System.out.println(dog.move());

        Animal cat = new Cat(new MeowSound());
        System.out.println(cat.speak());
        System.out.println(cat.move());
    }
}

