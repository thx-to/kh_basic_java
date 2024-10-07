package JAVA_240927_07_ObjectTypeCheck;
// 객체 타입 확인 : instanceof
// 반환값(true/flase) = 좌항(객체) instanceof 우항(클래스)
// 객체가 특정 클래스의 인스턴스인지를 확인하기 위해 사용

public class ObjectTypeEx {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent); // true
        System.out.println(child instanceof Parent); // true, 상속 관계가 존재
        System.out.println(parent instanceof Child); // false
        System.out.println(child instanceof Child); // true
    }
}

class Parent {
    String name;

    // 생성자
    public Parent(String name) {
        this.name = name;
    }
}


class Child extends Parent {
    String name;
    public Child(String name) {
        super("PHAM");
        this.name = name;
    }
}