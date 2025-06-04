package ANStrategy;

public class Dog {
    private Strategy strategy;

    public Dog(Strategy moveStrategy) {
        this.strategy = moveStrategy;
    }

    public void performMove() {
        strategy.move();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

