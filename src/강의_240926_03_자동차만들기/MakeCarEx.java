package 강의_240926_03_자동차만들기;

public class MakeCarEx {
    public static void main(String[] args) {

        String factory = "현대자동차 울산 공장:";
        Car gv70 = new Car("GV70", 220, 280, "Black");
        Car ionic5N = new Car("아이오닉5N", 250, 600, "White");
        Car x6 = new Car("X6", 230, 350, "Gray");
        Car santafe = new Car();
        Car sorento = new Car("쏘렌토");
        gv70.getCarInfo();
        ionic5N.getCarInfo();
        x6.getCarInfo();
        santafe.getCarInfo();
        sorento.getCarInfo();
        System.out.println(Car.productNumber);
        System.out.println(Car.company);


    }
}

// 외부에 또다른 클래스도 생성 가능(앞에 public이 없는 클래스), 파일이 주인이 아니고 외부에서 참조를 하지 않아도 됨
// 같은 클래스 내에 여러 개의 클래스도 만들 수 있음
// 자바는 클래스 이름과 파일 이름이 같아야 하고, 앞에 public이 붙어 있어야 함 / 패키지 밖에 있어도 참조가 되어야 하기 때문에

// 차 만들기
class Car {

    // 클래스 변수
    // 스태틱(메소드) 영역 : 클래스들의 클래스 정보, 정적 변수, 상수, 메소드 코드 등이 저장되는 공간
    // 프로그램 실행 도중 변경되지 않는 정적 변수와 메소드 코드도 이 영역에 저장됨
    // static 예약어로 선정된 필드, 메소드가 저장되는 공간, 클래스 변수 등
    // 모든 차에 대해서 동일한 값으로 고정
    static int productNumber = 0; // 클래스 필드 (딱 한번만 만들어짐)
    static String company = "현대자동차"; // 클래스 필드

    // 인스턴스 변수
    // 차마다 다름, 차를 만들 때마다 별도로 만들어줘야 함
    String modelName; // 인스턴스 필드
    int speed; // 인스턴스 필드
    int horsePower; // 인스턴스 필드
    String color; // 인스턴스 필드
    Car(){ // 생성자를 만들어줘서(Car(){}의 빈 형태도 괜찮음) Car santafe = new Car();의 오류를 없앰
        modelName = "산타페";
        speed = 200;
        horsePower = 200;
        color = "red";
    }
    Car(String modelName) { // Car sorento = new Car("쏘렌토");의 오류를 없앰
        color = "red";
    }

    // 생성자 만들기 (매개변수가 있는 생성자)
    // this는 파이썬의 self와 같음, 자기 객체를 참조하는 변수(포인터)
    // 생성자 맨 앞에 숨어 있음 Car(this.String name~~~)
    Car(String name, int speed, int power, String color) { // 객체를 만들 때 불려짐
        modelName = name;
        this.speed = speed; // 객체마다 다름, 외부에서 사용시 ex) sonata.speed
        this.horsePower = power;
        this.color = color;
        productNumber += 1; // 클래스 필드, 생산 대수 카운트

    }
    void getCarInfo() {
        System.out.println("이름 : " + this.modelName);
        System.out.println("속도 : " + this.speed);
        System.out.println("마력 : " + this.horsePower);
        System.out.println("색상 : " + this.color);
        System.out.println("--------------------------");
    }
}