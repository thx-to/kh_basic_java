package 강의_240926_06_This와This;
// this : 자기 자신의 객체를 참조하는 변수
// this() 메소드 : 생성자 내에서 다른 생성자를 호출할 때 사용

public class ThisMethodEx {
    public static void main(String[] args) {
        Car car = new Car(); // 아래 빈 생성자가 있기 때문에 가능함
    }
}

class Car {
    private String name; // 이름
    private String year; // 연식
    private String color; // 색상
    private int speed; // 속도

    // 생성자를 여러개 만들기
    // 생성자 쉽게 만드는 방법
    // 마우스 오른쪽버튼 > Generate > Constructor


    // 전체에 대한 생성자
    public Car(String name, String year, String color, int speed) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.speed = speed;

    }


    // speed를 뺸 생성자
    public Car(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;

    }


    // 빈 생성자
    public Car() {
        // 생성자 안에서 또 다른 생성자를 불러올 때 this() 메소드를 씀
        this("산타페", "2024년식", "Black");

    }


}

