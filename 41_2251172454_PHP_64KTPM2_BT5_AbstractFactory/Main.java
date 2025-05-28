package AnimalCP;

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        IAnimal DogObj = Dog.createAnimal();
        System.out.println(DogObj.MakeSound());

        Animal Cat = new Cat();
        IAnimal CatObj = Cat.createAnimal();
        System.out.println(CatObj.MakeSound());
    }
}
