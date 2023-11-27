public class ElevatorFactoryFactory {

    public static ElevatorFactory getFactory(VendorID vendorID) { // 팩토리 메서드
        return switch (vendorID) {
            case LG -> LGElevatorFactory.getInstance();
            case HYUNDAI -> HyundaiElevatorFactory.getInstance();
            case SAMSUNG -> SamsungElevatorFactory.getInstance();
        };
    }
}
