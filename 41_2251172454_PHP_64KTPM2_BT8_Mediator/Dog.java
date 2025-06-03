package ANMediator;

public class Dog {
    private final Mediator mediator;

    public Dog(Mediator mediator) {
        this.mediator = mediator;
    }

    public void bark() {
        System.out.println("Dog: Woof!");
        mediator.notify(this, "bark");
    }

}
