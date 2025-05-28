package ANBridge;

abstract class Animal {
    private SoundMaker soundMaker;

    public Animal(SoundMaker soundMaker) {
        this.soundMaker = soundMaker;
    }
    public String speak(){
        return soundMaker.MakeSound();
    }

    abstract String move();
}
