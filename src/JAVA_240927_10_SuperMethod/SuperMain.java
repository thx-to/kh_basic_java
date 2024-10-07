package JAVA_240927_10_SuperMethod;

public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();
        // 1) Child child = new Child(30);
        child.childMethod();
    }
}

class Parent {
    int x = 10;

    // 2) Parent(int x) {
    // 2)    this.x = x;
    // 2) }
}

class Child extends Parent {
    int x = 20;

    // 3) Child(int x) {
    // 3)     super(x);
    // 3) }

    // 자식클래스의 생성자를 만들지 않아도 되는 이유
    // 부모의 클래스 생성 시 생성자를 만들지 않으면 기본생성자가 만들어짐
    // 기본생성자는 별도로 호출하지 않아도 자동으로 불려짐
    void childMethod() {

        // 1, 2, 3 풀면 출력값 바뀜
        System.out.println(x); // 20 > 20
        System.out.println(this.x); // 20 > 20
        System.out.println(super.x); // 10 > 30
    }
}

