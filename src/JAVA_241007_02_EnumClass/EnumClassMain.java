package JAVA_241007_02_EnumClass;

import java.util.Calendar;

// 열거형 : 특수한 상수들의 집합 ( 이 중에서 한개의 값을 선택하는 구조)
public class EnumClassMain {
    public static void main(String[] args) {

        // today 타입은 Week 타입
        Week today = null;
        Calendar cal = Calendar.getInstance();

        // DAY_OF_WEEK 주에서 몇 번째 날인지 반환
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1 :
                today = Week.SUNDAY; break;
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY; break;
            case 4 :
                today = Week. WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘은 " + today + " 입니다.");
    }

}


enum Week {

    // 특수한 '상수'라서 대문자로 기재하는 게 관례
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

}