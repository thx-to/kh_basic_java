package JAVA_241014_02_MethodReference;
// 메소드 참조 : 메소드를 참조해서 매개변수의 정보 및 반환 타입을 알아내어, 불필요한 매개변수를 제거하는 것이 목적

import java.util.function.IntBinaryOperator;


class Calculator {

    static int staticMethod(int x, int y) {
        return x + y;
    }

    int instanceMethod(int x, int y) {
        return x + y;
    }

}


public class MethodRefEx {
    public static void main(String[] args) {

        // 두개의 int 타입을 받아 int값을 반환하는 이항 연산자
        // 함수형 인터페이스를 제공해주기 때문에 별도로 함수형 인터페이스를 만들지 않아도 됨
        IntBinaryOperator operator;

        // 정적 메소드 참조
        // applyAsInt : 함수형 인터페이스에서 입력값을 받아 int 결과를 반환하는 메소드 (기본형 특화 함수형 인터페이스)
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1) " + operator.applyAsInt(1, 2));
        // 위의 문법을 이렇게 줄일 수도 있음
        // 클래스 :: 메소드
        // 컴파일러가 타입을 알고 있기 때문에 (메소드를 참조해서 불필요한 매개변수 제거)
        operator = Calculator :: staticMethod;
        System.out.println("결과 2) " + operator.applyAsInt(3, 4));

        // 인스턴스 메소드 참조
        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과 3) " + operator.applyAsInt(5, 6));
        // 위의 문법을 이렇게 줄일 수도 있음
        // 참조변수 :: 메소드
        operator = obj :: instanceMethod;
        System.out.println("결과 4) " + operator.applyAsInt(7, 8));


    }
}
