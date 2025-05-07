abstract class Animal {
    public abstract String MakeSound();
}
class Dog extends Animal{
    @Override
    public String MakeSound() {
        return "Woof";
    }
}
class Cat extends Animal{
    @Override
    public String MakeSound() {
        return "Meow";
    }
}
class Main{
    public static void main(String[] args) {
        Animal[] Animal = new Animal[2];
        Animal[0] = new Dog();
        Animal[1] = new Cat();
        for (Animal animal : Animal) {
            System.out.println(animal.MakeSound());
        }

    }
}
