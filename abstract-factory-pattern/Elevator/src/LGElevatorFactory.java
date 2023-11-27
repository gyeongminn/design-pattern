public class LGElevatorFactory extends ElevatorFactory { // 싱글턴을 적용한 LG 팩토리

    private static ElevatorFactory factory;


    public static ElevatorFactory getInstance() {
        if (factory == null) factory = new LGElevatorFactory();
        return factory;
    }

    public Motor createMotor() {
        return new LGMotor();
    }

    public Door createDoor() {
        return new LGDoor();
    }
}
