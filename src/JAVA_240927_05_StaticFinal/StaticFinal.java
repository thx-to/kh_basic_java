package JAVA_240927_05_StaticFinal;
// static final : 자바에서 상수를 정의하는 데 사용되는 키워드
// static final을 사용하여 정의된 변수는 클래스 수준에서 한 번 초기화되고, 이후 값이 변경되지 않는 상수가 됨
// 이렇게 정의된 상수는 클래스 내부에서 상숑되며, 객체의 생성 여부와 관계없이 항상 동일한 값을 가짐


public class StaticFinal {
    public static void main(String[] args) {

    }
}

/*
// 강의_240927_01 PKG의 IPadPro 맨 하단쪽 출고정보 출력 부분 예시
public class Common {
    final static String[] screenType = {"", "11인치", "12.9인치"};
    final static String[] colorType = {"", "스페이스그레이", "실버"};
    final static String[] memType = {"", "128BG", "256GB", "512GB", "1TB"};
    final static String[] netType = {"", "Wi-Fi", "Wi-Fi+Cellular"};
}

public class Constants {
    public static final int MAX_VALUE = 100; // 정수 상수
    public static final double PI = 3.14159; // 실수 상수
    public static final String GREETING = "Hello, World!"; // 문자열 상수
}
*/