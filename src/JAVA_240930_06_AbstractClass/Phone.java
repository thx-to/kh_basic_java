package JAVA_240930_06_AbstractClass;

// 추상클래스 생성
// 명시적으로 abstract 키워드를 사용
public abstract class Phone {

    String name;
    boolean isPower;

    // 생성자 만들기
    public Phone(String name) {
        this.name = name;
    }

    // 일반 메소드
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if (isPower) {
            System.out.println(name + "의 전원을 켭니다.");
        } else {
            System.out.println(name + "의 전원을 끕니다.");
        }
    }

    // 추상 메소드
    // abstract는 추상 메소드이기 때문에 구현부가 없어야 함
    // 중괄호를 치는 것 자체가 구현 메소드가 있다는 의미이기 때문에 추상 메소드에 사용하지 않음
    // 이름만 존재하는 추상 메소드
    // 상속받은 자식 클래스에서 반드시 구현해 줘야 함
    abstract void call();

}
