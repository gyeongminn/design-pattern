public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    protected void moveMotor(Direction direction) {
        System.out.println("LG 모터를 가동합니다.");
    }
}
