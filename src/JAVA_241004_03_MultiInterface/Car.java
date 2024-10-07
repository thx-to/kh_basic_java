package JAVA_241004_03_MultiInterface;

// 상속을 주기 위한 자동차 클래스 생성
public class Car {

    protected int speed;
    protected String color;
    protected String year;

    // generator로 생성자
    public Car(int speed, String color, String year) {
        this.speed = 150;
        this.color = "white";
        this.year = "1999년식";
    }
}
