public class Client {

    public static void main(String[] args) {
        VendorID vendorID = VendorID.SAMSUNG;

        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);
        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);
        door.open();
        motor.move(Direction.UP);
    }
}
