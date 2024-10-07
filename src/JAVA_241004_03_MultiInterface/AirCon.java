package JAVA_241004_03_MultiInterface;

public interface AirCon {

    // 상수처리, 앞에 자동으로 final static가 추가됨, 설계명세서 역할
    int MAX_TEMP = 30;
    int MIN_TEMP = 0;

    // 추상메소드
    // 앞에 자동으로 public abstract가 추가됨
    // 자식클래스에서 반드시 오버라이딩해야 함
    void airConON();
    void airConOFF();
    void setAirConTemp(int tmp);



}
