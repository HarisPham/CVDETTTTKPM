package ANBridge;

public class Cat extends Animal {
    public Cat(SoundMaker soundMaker){
        super(soundMaker);
    }
    public String move(){
        return "Sneak...";
    }
}
