package JAVA_240927_03_InheritanceBasic;
// 상속 : 자식 클래스가 부모 클래스의 기능을 그대로 물려받는 것
// 상속받은 자식클래스는 부모클래스와 같거나 크다
// 부모 클래스 먼저 생성된 이후 자식 클래스 생성, 자식 클래스 먼저 소멸된 이후 부모 클래스 소멸
// 사용 이유 : 재사용성, 확장성, 다형성(오버라이딩, 상속받은 기능을 재정의)
// 자바는 다중 상속을 지원하지 않음(다중 상속과 유사한 기능을 제공하기 위한 인터페이스가 있음)
// 클래스 상속 키워드 : extends
// 상속을 받지 않은 모든 클래스는 기본적으로 object 클래스로부터 상속받음
// 오버라이딩은 부모가 물려준 기능을 재정의하는 것 (재정의하지 않으면 부모의 메소드 호출)

public class InheritanceBasicEx {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("치와왕");
        System.out.println(dog.getName()); // 부모가 물려줘서 사용 가능

        HouseDog houseDog = new HouseDog();
        houseDog.setName("스탠뿌");
        houseDog.sleep();
        houseDog.sleep(4);

    }
}

class Animal {
    protected String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal { // Animal의 자식 클래스
    void sleep() { // 부모 클래스의 sleep 정의
        System.out.println(name + "zzz");
    }
}

class HouseDog extends Dog { // Dog의 자식 클래스, 다단계 상속
    @Override // 오버라이드 관계가 맞는지 문법적으로 확인해주는 어노테이션(Annotation), 아니면 오류 출력
    // 오버라이딩 관계가 성립하려면 메서드 이름과 반환 타입이 같아야 함
    void sleep() { // 자식 클래스의 sleep 정의
        System.out.println(name + "zzz in the House");
    }

    // 오버라이딩 이후 오버로딩 관계
    // sleep이라는 메소드를 중복하여 정의
    // 매개변수를 hour로 설정함
    void sleep(int hour) {
        System.out.println(name + "zzz in the House for " + hour + "hours");
    }
}