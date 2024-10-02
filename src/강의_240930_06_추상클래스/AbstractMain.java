package 강의_240930_06_추상클래스;
// 추상클래스 : 직접 인스턴스를 생성할 수 없는 클래스 (인스턴스화가 안되는 클래스)
// 인스턴스화가 되려면 상속을 통해서만 가능
// 부모가 만든 추상메소드는 자식이 반드시 구현해야 함
// 단일 상속만 지원
// 명시적으로 abstract 키워드를 사용해야 함
// 일반 메소드도 포함할 수 있음

// 기존의 오버라이드와 다른 지점 : 기존 상속에서는 오버라이드를 해도 되고 안해도 되고 (선택의 영역)
// 추상화에서는 오버라이드를 반드시 해줘야 함 (부모의 추상 메소드를 구현해줘야 하기 때문)


public class AbstractMain {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("iPhone 16 Pro");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();


        // 익명의 클래스 (1회용 클래스를 한 번 만드는 방법)
        // 선언과 동시에 객체 생성
        // 그 자체로 구현과 인스턴스화가 결합된 형태
        // call 기능을 바로 여기서 오버라이딩해서 일반 객체가 되기 위한 조건 만족
        Phone phone = new Phone("iPhone 16 Pro Max") {
            @Override
            void call() {
                System.out.println("일회용 객체 생성");
            }
        }; // 중괄호 뒤에 세미콜론이 붙는 드문 상황
        phone.setPower(false);
        phone.call();
    }
}
