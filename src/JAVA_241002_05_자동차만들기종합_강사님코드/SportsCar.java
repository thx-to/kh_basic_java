package JAVA_241002_05_자동차만들기종합_강사님코드;

public class SportsCar extends Car {
    public SportsCar(String name) {
        super(250, 8, 30, 2, name);
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;
    }
}