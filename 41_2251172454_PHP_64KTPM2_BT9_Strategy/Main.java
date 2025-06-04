package ANStrategy;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(new WalkStrategy());
        dog.performMove();


        dog.setStrategy(new RunStrategy());
        dog.performMove();
    }
}
