package JAVA_241004_06_NestedInterface;
// 중첩인터페이스 : 클래스 내부에 선언된 인터페이스
// 중첩인터페이스는 주로 UI 프로그래밍에서 이벤트 처리할 목적으로 활용
// OnClickListener는 참조 변수인 인터페이스
// 인터페이스로 상속받는 클래스가 여기 올 수 있음

public class NestedInterfaceEx {
    public static void main(String[] args) {

        // 버튼1 객체를 만듦
        Button button1 = new Button();

        // 버튼1 터치시 전화걸기
        button1.setOnClickListener(new CallListener());
        button1.touch();


        // 버튼2 객체를 만듦
        Button button2 = new Button();

        // 버튼2 터치시 메시지 보내기
        button2.setOnClickListener(new MessageListener());
        button2.touch();


    }
}
