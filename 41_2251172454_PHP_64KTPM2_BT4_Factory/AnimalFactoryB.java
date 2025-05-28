package AnimalBT3;

public class AnimalFactoryB implements IAnimal{
    @Override
    public Dog createDog() {
        return new WhiteDog();
    }
    @Override
    public Cat createCat() {
        return new YellowCat();
    }
}
