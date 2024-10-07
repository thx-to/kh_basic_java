package JAVA_241004_06_NestedInterface;

public class CallListener implements Button.OnClickListener {

    // OnClick 메소드 구현 필요
    // 중첩인터페이스(OnClickListener) 내의 OnClick 메소드가 추상메소드
    // 상속받은 추상메소드 구현
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }

}
