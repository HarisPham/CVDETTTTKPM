package ANBridge;

public class Dog extends Animal {
    public Dog(SoundMaker soundMaker){
        super(soundMaker);
    }
    public String move(){
        return "Run...";
    }
}
