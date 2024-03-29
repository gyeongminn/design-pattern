public class SamsungElevatorFactory extends ElevatorFactory {

    private static ElevatorFactory factory;

    public static ElevatorFactory getInstance() {
        if (factory == null) factory = new SamsungElevatorFactory();
        return factory;
    }

    public Motor createMotor() {
        return new SamsungMotor();
    }

    public Door createDoor() {
        return new SamsungDoor();
    }
}
