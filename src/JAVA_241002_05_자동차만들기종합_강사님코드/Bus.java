package JAVA_241002_05_자동차만들기종합_강사님코드;

public class Bus extends Car {
    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
    }
}