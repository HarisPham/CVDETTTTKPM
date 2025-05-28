package ANBuilder;

public class Dog {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String MakeSound() {
        return name + ": Woof";
    }
}
