package AnimalBT3;

public class Main {
    public static void main(String[] args) {
        IAnimal dogAFactory = new AnimalFactoryA();
        Dog dogA = dogAFactory.createDog();
        System.out.println(dogA.MakeSound());

        IAnimal dogBFactory = new AnimalFactoryB();
        Dog dogB = dogBFactory.createDog();
        System.out.println(dogB.MakeSound());

        IAnimal catAFactory = new AnimalFactoryA();
        Cat catA = catAFactory.createCat();
        System.out.println(catA.MakeSound());

        IAnimal catBFactory = new AnimalFactoryB();
        Cat catB = catBFactory.createCat();
        System.out.println(catB.MakeSound());
    }
}
