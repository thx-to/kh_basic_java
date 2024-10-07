package JAVA_241004_03_MultiInterface;

public interface AutoDrive {

    // 추상메소드
    // 앞에 자동으로 public abstract가 추가됨
    // 자식클래스에서 반드시 오버라이딩해야 함
    void autoDrvOn();
    void autoDrvOFF();
}
