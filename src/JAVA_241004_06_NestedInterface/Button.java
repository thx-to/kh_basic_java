package JAVA_241004_06_NestedInterface;

public class Button {

    // OnClickListener 인터페이스에 대한 참조 변수 만들기
    // 외부에서 객체(OnClickListener 인터페이스의 자식들)를 만들어서 대입하는 형태
    // OnClickListener로부터 상속받은 객체
    // listener(객체의 주소)에 접근하기 위한 내부 참조 변수
    OnClickListener listener;

    // 외부에서 만든 객체가 이쪽으로 들어옴
    // 오버라이딩/매개변수의 다형성 할 때 씀
    void setOnClickListener(OnClickListener listener) {

        // 내부 참조 변수 listener 대입
        // 인터페이스(OnClickListener)로 상속받은 객체(CallListener, MessageListener)만 올 수 있음
        this.listener = listener;
    }

    void touch() {

        // 구현된 객체의 onClick() 메소드 호출
        listener.onClick();
    }

    interface OnClickListener {

        // onClick 추상메소드 만들기
        void onClick();


    }


}
