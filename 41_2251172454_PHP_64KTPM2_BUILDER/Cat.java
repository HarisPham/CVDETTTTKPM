package ANBuilder;

public class Cat{
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String MakeSound(){
      return name + ": Meow";
    }
}
