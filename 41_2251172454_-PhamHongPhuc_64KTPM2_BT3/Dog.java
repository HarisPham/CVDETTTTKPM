package AnimalCP;

public class Dog extends Animal implements IAnimal{
    public IAnimal createAnimal() {
        return new Dog();
    }
    public String MakeSound() {
        return "Woof";
    }
}
