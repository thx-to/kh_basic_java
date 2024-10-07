package JAVA_240927_04_Overriding;
// final 키워드 : 클래스, 필드, 메소드 선언 시 사용할 수 있음
// 메소드에 사용하는 경우 상속을 하면 오버라이딩을 금지할 수 있음

public class OverridingEx {
    public static void main(String[] args) {

        SportsCar sportsCar = new SportsCar("Ferrari");
    }
}

// Car라는 클래스를 만들어 봄
class Car {

    int speed;
    String name;
    String color;

    // 오버라이딩을 못하게 final을 걸어버림
    // 엑셀은 차를 빠르게 가기 위해 만드는 것이므로, 바꾸게 하면 안됨
    final void accelerator() {
        System.out.println("차의 속도가 증가합니다.");
    }

    // 오버라이딩을 못하게 final을 걸어버림
    // 변경을 하면 안됨
    void breakPanel() {
        System.out.println("차의 속도가 감소합니다.");
    }

}


// 상속을 줘봄
class SportsCar extends Car {

    boolean isTurbo;

    // 스포츠카 생성자 만들기
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        color = "red";
    }

    /*
    // 액셀은 final 걸어둬서 오버라이딩 불가
    @Override
    void accelerator() {
        System.out.println("차가 하늘을 납니다.");
    }
    */

    /*
    // 브레이크는 final 걸어둬서 오버라이딩 불가
    @Override
    void breakPanel() {
        System.out.println("차가 물속으로 갑니다.");
    }
    */

    // getter
    int getSpeed() {
        if (isTurbo) return speed *= 1.2;
        return speed;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    // setter
    public void setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }

}
