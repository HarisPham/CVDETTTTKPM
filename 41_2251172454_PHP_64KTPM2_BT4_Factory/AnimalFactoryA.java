package AnimalBT3;

public class AnimalFactoryA implements IAnimal{
    @Override
    public Dog createDog() {
        return new BlackDog();
    }
    @Override
    public Cat createCat() {
        return new BlackCat();
    }
}

