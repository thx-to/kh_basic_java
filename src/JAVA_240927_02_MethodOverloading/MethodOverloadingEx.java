package JAVA_240927_02_MethodOverloading;
// 같은 이름의 메소드를 중복하여 정의하는 것 (정적 바인딩)
// 입력받을 값이 타입이 결정되면 그때 결합관계가 생김
// 매개변수의 타입이나 개수로 구분
// 다형성을 구현하는 중요 요소
// 메소드 오버로딩과 생성자 오버로딩은 동작이 같음
// 반환값이나 접근제한자와는 관계 없음

public class MethodOverloadingEx {
    public static void main(String[] args) {

        // 1) 정수 반환
        System.out.println(sum(10, 20));

        // 2) 정수 반환
        System.out.println(sum(10, 20, 30));

        // 3) 실수 반환
        System.out.println(sum(10, 3.33, 4.55));

        // 4) 문자열 반환
        System.out.println(sum("SUM : ", 10, 20));


    }

    // A) 기본 메소드
    static int sum(int x, int y) {
        return x + y;
    }

    // B) 2 출력을 위한 메소드 추가
    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    // C) 3 출력을 위한 메소드 추가
    static double sum(int x, double y, double z){
        return x + y + z;
    }

    // D) 4 출력을 위한 메소드 추가
    static String sum(String x, int y, int z) {
        return x + (y + z);
    }


}
