package p04_recharge;

public class RobotAdapter implements Rechargeable {
    private static final int DEFAULT_POWER = 0;

    // adapter design pattern
    private Robot robot;
    private int currentPower;
    public RobotAdapter(Robot robot){
        this.robot = robot;
        this.currentPower = DEFAULT_POWER;
    }

    @Override
    public void recharge() {
        this.currentPower ++;
    }
}
