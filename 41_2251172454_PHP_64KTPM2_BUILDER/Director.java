package ANBuilder;

import AnimalBT3.WhiteDog;

public class Director {
    private IAnimal builder;
    public void buildDog(IAnimal builder) {
        builder.reset();
        builder.setName("White Dog");
    }
    public void buildCat(IAnimal builder) {
        builder.reset();
        builder.setName("Yellow Cat");
    }
}
