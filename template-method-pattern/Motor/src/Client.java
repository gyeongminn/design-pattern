public class Client {
    public static void main(String[] args) {
        Door door1 = new Door();
        Door door2 = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door1);
        LGMotor lgMotor = new LGMotor(door2);
        hyundaiMotor.move(Direction.UP);
        lgMotor.move(Direction.UP);
    }
}
