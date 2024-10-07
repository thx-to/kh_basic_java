package JAVA_241002_04_자동차만들기종합_팀원1수정1;

public abstract class Vehicle {
    public String vehicleType;
    public final int FUEL_PRICE = 2000;
    final int[] DESTINATION_DIST = {0, 400, 200, 150, 300};

    public int mileage;
    public int seat;
    public int speed;
    public int fuelTank;

    public Vehicle (String vehicleType, int mileage, int seat, int speed, int fuelTank) {
        this.vehicleType = vehicleType;
        this.mileage = mileage;
        this.seat = seat;
        this.speed = speed;
        this.fuelTank = fuelTank;
    }

    abstract void drive();
}
