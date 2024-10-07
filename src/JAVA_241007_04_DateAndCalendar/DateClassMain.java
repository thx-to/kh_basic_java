package JAVA_241007_04_DateAndCalendar;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateClassMain {
    public static void main(String[] args) {

        DateFunc();
        CalendarFunc();

    }

    static void DateFunc() {

        // Date 클래스 : 자바 초기 버전부터 제공되는 클래스
        // java.util 패키지에 포함되어 제공
        // Date 객체는 UTC(협정 세계시)를 기준으로 1970년 1월 1일 자정부터 밀리초 단위로 경과 시간 계산
        // 불변성 없음(설정된 시간이 변경될 여지가 있음), 현재 실무에서 거의 사용되지 않음

        Date date = new Date();
        System.out.println(date);

        // 원하는 포맷으로 날짜 정보 출력
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        System.out.println(sdf.format(date)); // 241007

        // yyyy : 연도를 4자리로 표현
        // yy : 연도를 2자리로 표현
        // MM : 월을 2자리로 표현 (소문자 m은 minute)
        // HH : 시간을 2자리로 표현, 24시간제
        // hh : 시간을 2자리로 표현, 12시간제
        // mm : 분을 2자리로 표현
        // ss : 초를 2자리로 표현
        // W : 월의 몇번째 주차인지 표현
        // w : 연의 몇번째 주차인지 표현
        // SimpleDateFormat에 대한 참조변수 7개 생성
        SimpleDateFormat f1, f2, f3, f4, f5, f6;
        f1 = new SimpleDateFormat("yyyy-MM-dd"); // 2024-10-07
        f2 = new SimpleDateFormat("yy-MM-dd");; // 24-10-07
        f3 = new SimpleDateFormat("yyyy년 MM월 d일"); // 2024년 10월 7일
        f4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 2024-10-07- 11:16:23
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다."); // 오늘은 10월의 2번째 주, 7번째 날입니다.
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다."); // 오늘은 2024년의 41주차 입니다.
        System.out.println(f1.format(date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
        System.out.println(f4.format(date));
        System.out.println(f5.format(date));
        System.out.println(f6.format(date));

    }


    static void CalendarFunc() {

        // Calendar 클래스 : Date 클래스의 단점을 보완하기 위해 도입
        // java.util에 포함되어 제공
        // Calendar는 추상클래스, 특정 국가나 문화의 달력 시스템에 맞게 하위 클래스가 구현
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR)); // 2024

        // 배열에 인덱스에 맞춰져 있기 때문에 월은 +1을 해야 함
        System.out.println(cal.get(Calendar.MONTH) + 1); // 10

        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 7
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 2
        System.out.println(cal.get(Calendar.AM_PM)); // 0
        System.out.println(cal.get(Calendar.HOUR)); // 11
        System.out.println(cal.get(Calendar.MINUTE)); // 30
        System.out.println(cal.get(Calendar.SECOND)); // 34

    }


}
