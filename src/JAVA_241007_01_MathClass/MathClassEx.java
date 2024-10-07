package JAVA_241007_01_MathClass;
// Math 클래스 : 수학에서 자주 사용하는 상수들과 함수들(메소드)을 미리 구현해 놓은 클래스
// 모든 메소드는 클래스 메소드(static method)로, 객체 생성 없이 바로 사용 가능
// java.lang에 포함되어 있어 별도의 import가 필요 없음


import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathClassEx {
    public static void main(String[] args) {

        randomFunc();
        MathMethodFunc();

    }


    // random() 메소드 : 0.0 이상 1.0 미만의 범위에서 임의의 double형 값 한개를 반환
    static void randomFunc() {

        for (int i = 0; i < 10; i++) {

            // 기본 random() 반환
            System.out.println(Math.random());

            // 1에서 100 사이의 임의의 수 반환 (*100, +1)
            System.out.println((int)(Math.random() * 100) + 1 + "");

            // 1에서 45 사이의 임의의 수 반환 (로또, 실제 사용시 중복제거 필요)
            System.out.println((int)(Math.random() * 45) + 1 + "");

        }

    }


    // abs() 메소드 : 절대값을 구하는 메소드
    // floor() 메소드 : 주어진 숫자를 내림한 결과 반환 (소수점 이하를 날려버림)
    // ceil() 메소드 : 주어진 숫자를 올림한 결과 반환 (소수점 이하를 날려버림)
    // round() 메소드 : 주어진 숫자의 소수점 첫째 자리에서 반올림한 정수 반환 (소수점 이하를 날려버림, 자릿수 지정할 수 없고 무조건 정수값이 반환됨)
    // BigDecimal() 메소드 : 정확도가 향상된 계산을 위한 숫자, 객체 타입, 내부 메소드가 많음
    // double, float 대신 BigDecimal 사용 : 부동소수점 오차를 줄이고 정밀한 숫자 표현
    // min() 메소드 : 전달된 두 값 중 작은 값 반환
    // max() 메소드 : 전달된 두 값 중 큰 값 반환
    static void MathMethodFunc() {

        // 절대값 반환, 두 값 모두 10
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        // 결과를 내려서 반환
        System.out.println(Math.floor(10.99999));

        // 결과를 올려서 반환
        System.out.println(Math.ceil(10.00001));

        // 결과를 반올림해서 반환
        System.out.println(Math.round(10.49999));
        System.out.println(Math.round(10.50000));

        // 두 값 중 작은 값, 큰 값 각각 반환
        System.out.println(Math.min(20, 30));
        System.out.println(Math.max(20, 30));

        // BigDecimal 사용 예제
        // setScale(소수점자리수, 처리방식)
        BigDecimal number = new BigDecimal("10.355");
        System.out.println(number.setScale(2, RoundingMode.HALF_UP));

    }


}
