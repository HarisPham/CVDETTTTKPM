package ANBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        DogBuilder dogBuilder = new DogBuilder();
        director.buildDog(dogBuilder);
        Dog dog = (Dog) dogBuilder.getResult();
        System.out.println(dog.MakeSound());

        CatBuilder catBuilder = new CatBuilder();
        director.buildCat(catBuilder);
        Cat cat = (Cat) catBuilder.getResult();
        System.out.println(cat.MakeSound());
    }
}

