package ANMediator;

public class Cat {
    private final Mediator mediator;

    public Cat(Mediator mediator) {
        this.mediator = mediator;
    }

    public void meow() {
        System.out.println("Cat: Meow~");
        mediator.notify(this, "meow");
    }

}
