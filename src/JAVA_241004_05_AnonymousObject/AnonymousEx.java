package JAVA_241004_05_AnonymousObject;

public class AnonymousEx {
    public static void main(String[] args) {

        // 1. 일반적인 방법, 부모 클래스에서 객체 생성
        Child child = new Child();
        child.methodParent();

        Child2 child2 = new Child2();
        child2.parent.methodParent();

    }
}


class Parent {

    String name = "Parent Class";

    void methodParent() {
        System.out.println("Parent Method : " + this.name);
    }
}


// 부모 클래스로부터 상속받은 자식 클래스 만들기
class Child extends Parent {

    String name = "Child Class";

    @Override
    void methodParent() {

        // 자기 자신의 메소드 호출
        System.out.println("Class Name : "  + this.name);

        // 부모의 메소드 호출
        System.out.println("Class Name : " + super.name);

    }
}


// 익명의 객체
// Parent를 상속받고 오버라이딩해서 직접 구현
// 상속 구현 부분을 중괄호를 넣고 바로 할 수 있음
class Child2 {

    // 2. 구현부를 직접 넣기
    Parent parent = new Parent() {

        int childField;
        void methodChild() {
            System.out.println("자식이 별도로 만든 메소드");
        }

        @Override
        void methodParent() {
            System.out.println("부모의 메소드를 오버라이딩");
        }

    };
}