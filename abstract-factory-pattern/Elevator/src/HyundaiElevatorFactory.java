public class HyundaiElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;

    public static ElevatorFactory getInstance() {
        if (factory == null) factory = new HyundaiElevatorFactory();
        return factory;
    }

    public Motor createMotor() {
        return new HyundaiMotor();
    }

    public Door createDoor() {
        return new HyundaiDoor();
    }
}
