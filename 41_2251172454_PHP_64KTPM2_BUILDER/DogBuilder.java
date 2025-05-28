package ANBuilder;

public class DogBuilder implements IAnimal{
    private Dog result;
    public void reset() {
        result = new Dog();
    }
    public void setName(String name) {
        result.setName(name);
    }
    public Object getResult() {
        return result;
    }
}
