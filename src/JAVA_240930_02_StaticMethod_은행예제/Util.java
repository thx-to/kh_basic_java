package JAVA_240930_02_StaticMethod_은행예제;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    // static 메소드는 유틸리티성 메소드를 작성할 때 자주 사용됨
    // 만들어 놓고 필요할 때 호출해서 사용

    // 두 수의 최대값을 반환하는 메소드 만들기
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    // 홀수 짝수를 판별하는 메소드 만들기
    public static boolean isEven(int number) {
        return number % 2 == 0; // 2로 나눈 나머지가 0이면(짝수면) true, 아니면 false 반환
    }

    // 문자열을 입력받아 시간 정보 출력하는 메소드 만들기
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }


}
