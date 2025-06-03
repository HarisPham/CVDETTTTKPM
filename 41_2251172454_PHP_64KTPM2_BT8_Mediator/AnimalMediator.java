package ANMediator;

public class AnimalMediator implements Mediator {
    private Dog dog;
    private Cat cat;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void notify(Object sender, String event) {
        if (sender == dog && event.equals("bark")) {
            reactToDog();
        } else if (sender == cat && event.equals("meow")) {
            assert dog != null;
            reactToCat();
        }
    }

    public void reactToDog() {
        System.out.println("Cat: Hiss! Runs away");
    }

    public void reactToCat() {
        System.out.println("Dog: Grrr!");
    }
}
