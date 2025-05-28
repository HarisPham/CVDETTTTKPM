package BT6_HT5;

public class RobotAdapter implements IAnimal {
    private final Robot robot;

    public RobotAdapter(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String MakeSound() {
        return robot.playBeep();
    }
}