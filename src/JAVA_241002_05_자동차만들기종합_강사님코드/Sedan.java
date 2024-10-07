package JAVA_241002_05_자동차만들기종합_강사님코드;

public class Sedan extends Car {
    public Sedan(String name) {
        super(200, 12, 45, 4, name);
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }
}