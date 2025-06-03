package ANMediator;

public class Main {
    public static void main(String[] args) {
        AnimalMediator mediator = new AnimalMediator();
        Dog dog = new Dog(mediator);
        Cat cat = new Cat(mediator);
        mediator.setDog(dog);
        mediator.setCat(cat);
        dog.bark();
        cat.meow();
    }
}
