package ANBuilder;

public class CatBuilder implements IAnimal {
    private Cat result;
    public void reset() {
        result = new Cat();
    }
    public void setName(String name) {
        result.setName(name);
    }
    @Override
    public Object getResult() {
        return result;
    }
}
