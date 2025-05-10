package AnimalCP;

public class Cat extends Animal implements IAnimal{
    public IAnimal createAnimal() {
        return new Cat();
    }
    public String MakeSound() {
            return "Meow";
    }
}

