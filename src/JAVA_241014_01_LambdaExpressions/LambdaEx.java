package JAVA_241014_01_LambdaExpressions;
// Lambda : 자바 8 버전에서 도입, 간단한 익명 함수를 생성하기 위한 방법을 제공
// 주로 함수형 프로그래밍 스타일(주로 리액트가 함수형 프로그램으로 되어 있음)을 지원
// 람다 표현식 스타일은 기본적으로 (매개변수 목록)->{구현부;}
// 타입 추론이 가능한(컴파일러가 어떤 타입인지 알아낼 수 있는 한) 모든 것을 생략
// 매개변수가 하나인 경우에는 소괄호() 생략 가능
// 함수의 구현부(함수의 몸체)가 하나의 명령어인 경우(한 문장, 한 줄인 경우) 중괄호{} 생략 가능

// 함수형 인터페이스 : 자바의 경우 함수가 단독으로 존재할 수 없음 (참조변수 없이 메소드를 호출할 수 없으)
// 자바에서 함수를 만들기 위해서는, 먼저 함수형 인터페이스를 만들고 인터페이스에 람다식으로 구현할 인터페이스를 선언해야 함


// 기본 인터페이스 만들어주기
interface Calculator {

    // 인터페이스 문법, 앞에 자동으로 public abstract가 추가됨
    int sum(int a, int b);

}


// 기본 객체지향 문법에서 사용하기 위한 상속 클래스
// implements로 Calculator 인터페이스를 상속받음
class MyCalculator implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a + b;

    }
}


// 매개변수가 있는 람다식
// @FunctionalInterface 역할 1) 이 인터페이스는 함수형 인터페이스를 사용하기 위한 인터페이스라고 선언
// @FunctionalInterface 역할 2) 메소드가 하나만 올 수 있게 함, 두개 이상 오면 오류를 잡아냄
@FunctionalInterface
interface MyFuncInterface {
    public void method(int x)
;}


// 매개변수와 반환값이 있는 람다식
@FunctionalInterface
interface MyFuncInter2 {
    // public 안붙여도 반환타입이 public이라서 생략 가능
    public int min(int x, int y);
}


public class LambdaEx {
    public static void main(String[] args) {

        // 기본 객체지향문법
        // MyCalculator의 참조변수로 객체에 접근
        // 인터페이스에서 상속받은 MyCalculator 클래스에서 오버라이딩된 sum 메소드 호출
        MyCalculator calc1 = new MyCalculator();
        int rst1 = calc1.sum(3, 4);
        System.out.println(rst1);

        // 기본 람다식으로 구현하기
        // 인터페이스 내에 메소드가 2개면 안됨 (구분을 못함)
        // 함수형 인터페이스 구현시 메소드는 1개여야 함
        // 함수 하나마다 인터페이스 하나씩 다 감아줘야 함
        // 인터페이스를 상속받아 클래스 대신 람다식으로 구현
        Calculator calc2 = (int a, int b) -> a + b;
        int rst2 = calc2.sum(5, 6);
        System.out.println(rst2);

        // 매개변수가 있는 람다식 구현
        // 매개변수가 x 하나라 소괄호() 생략
        // 익명의 함수를 만듦
        MyFuncInterface mf = x -> {
            int rst = x * 5;
            System.out.println(rst);
        };
        // 익명의 함수를 호출해줌
        // 불리면서 실행이 됨
        mf.method(100);

        // 매개변수와 반환값이 있는 람다식 구현
        // 매개변수가 2개니까 소괄호() 넣어줌
        // 구현부가 한문장이라 중괄호{} 생략
        MyFuncInter2 mf2 = (x, y) -> x < y ? x : y;
        System.out.println(mf2.min(3, 4));

    }
}
