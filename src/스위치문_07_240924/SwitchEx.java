package 스위치문_07_240924;
// switch문은 if문과 마찬가지로 조건 제어문
// if문은 조건식의 결과(true/false)에 따라 분기
// switch문은 변수의 값에 따라 실행문이 결정됨

// switch ~ case문의 구조
// switch(변수 {
// case 값 : 정수, 문자, 문자열이 올 수 있음 (실수는 못옴)
// 실행문
// break; switch문 탈출

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        // 계절 입력 및 안내문 출력 - if문
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next(); // String이 대문자인 이유는 참조 타입이라서
        // 문자열 비교는 equals()를 씀, ==는 안됨 (참조 타입엔 주소가 저장되는데 spring이라는 문자열이랑은 비교 자체가 안됨)
        // equals는 기본적으로 오버라이딩(재정의)이 걸려 있음, string 내부에서 season에 있는 문자열과 spring이 같은지 비교하도록 재정의해서 사용
        if (season.equals("spring")) {
            System.out.println("꽃이 피는 봄이 왔어요.");
        } else if (season.equals("summer")) {
            System.out.println("무더운 여름입니다.");
        // 가을은 fall, autumn으로 표기될 수 있으니 or 조건으로 사용 '둘 중에 하나가 오면'
        } else if (season.equals("fall") || season.equals("autumn")) {
            System.out.println("쓸쓸한 가을입니다.");
        } else if (season.equals("winter")) {
            System.out.println("추운 겨울입니다.");
        } else  {
            System.out.println("계절을 잘못 입력하셨습니다.");
        }
        */

        /*
        //계절 안내 및 안내문 출력 - switch문
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();
        switch (season) {
            case "spring" : System.out.println("꽃이 피는 봄이 왔어요."); break;
            case "summer" : System.out.println("무더운 여름입니다."); break;
            case "fall" : // 위거나 아래거나 둘중에 하나 (or와 같음)
            case "autumn" : System.out.println("쓸쓸한 가을입니다."); break;
            case "winter" : System.out.println("추운 겨울입니다."); break;
            default: System.out.println("계절을 잘못 입력하셨습니다.");
        }
        */

        // 헷갈리는 리터럴상수
        String name = "쿵";
        String addr = "쿵";
        // 쿵 이라는 문자를 컴파일러가 받아서 상수취급하고(리터럴상수), static 메모리 공간에 넣기
        // name은 stack 메모리에 저장되는 지역변수, 쿵을 바라보고 있음.
        // address도 지역변수, 쿵이라는 똑같은 문자가 있기 때문에 다시 만들지 않고 이미 만들어진 쿵을 바라봄
        // 동일한 문자열이 있으면 몇 개를 만들던지 주소가 같음
        // 내부에서 효율적으로 메모리 관리하기 때문
        // 주소를 다르게 할 수도 있음, String도 객체 타입이기 때문에

        // 문자열을 만들 때마다 새로운 공간을 받는데, 같은 문자면 컴파일 입장에서 재활용하는게 유리하기 때문에
        // 문자열 비교할 때는 equals를 사용하는게 편리함

        String city1 = new String("쿵"); // 이런식으로 String을 달리하면 주소는 달라지고(==) 내용은 여전히 같게 됨(equals)
        String city2 = new String("쿵"); // 이렇게 city1과 city2를 비교하면 주소는 다르고 내용은 같음

        if (name == addr) {
            System.out.println("name과 addr의 주소가 같습니다.");
        } else {
            System.out.println("name과 addr의 주소가 다릅니다.");
        }

        if (name.equals(addr)) {
            System.out.println("name과 addr의 내용이 같습니다.");
        } else {
            System.out.println("name과 addr의 내용이 다릅니다.");
        }

        if (city1 == city2) {
            System.out.println("city1과 city2의 주소가 같습니다.");
        } else {
            System.out.println("city1과 city2의 주소가 다릅니다.");
        }

        if (city1.equals(city2)) {
            System.out.println("city1과 city2의 내용이 같습니다.");
        } else {
            System.out.println("city1과 city2의 내용이 다릅니다.");
        }

    }
}
