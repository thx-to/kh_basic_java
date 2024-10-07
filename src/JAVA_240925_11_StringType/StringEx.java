package JAVA_240925_11_StringType;
// 문자열 : 문자가 연속적으로 존재하는 데이터 형
// 자바에서는 문자와 문자열을 구분함 "문자열" '문자'
// 자바는 문자열을 참조 타입으로 간주함
// 문자열을 표현하기 위해서는 객체를 만들어 사용하거나 리터럴 표기 방식으로 사용
// 리터럴 표기방식이 가독성이나 성능에서 유리함

public class StringEx {
    public static void main(String[] args) {


        /*
        // 문자열 예제
        String name1 = new String("쿵"); // 객체를 만들어 표기하는 방식
        String name2 = "쿠웅"; // 리터럴 표기방식

        // 문자열 내장 메서드

        // equals() : 두개의 문자열 내용이 동일한지 비교하여 결과를 반환
        String a = "hello";
        String b = "Hello";
        System.out.println(a.equals(b)); // false
        System.out.println(a.equalsIgnoreCase(b)); // true, 대소문자 구분하지 않음
        System.out.println(a == b); // false, 주소가 같은지를 물어봄

        // indexOf() : 문자열에서 특정 문자가 시작되는 인덱스 반환
        String c = "Hello Java";
        System.out.println(c.indexOf("Java")); // 6, 띄어쓰기 포함

        // contains() : 문자열에서 해당 문자열이 포함되어 있는지의 여부를 반환
        System.out.println(c.contains("Hello")); // Hello라는 문자가 있으니까 true

        // charAt() : 문자열에서 특정 위치(인덱스)의 문자를 리턴
        System.out.println(c.charAt(6)); // J, 띄어쓰기 포함

        // replace() : 특정 문자열을 다른 문자열로 대체
        String d = "안녕하세요, Java를 공부하겠습니다.";
        System.out.println(d.replace("Java", "Python")); // println에서만 문자열이 대체된 것처럼 보임
        System.out.println(d); // 위 구문에서 Java를 Python으로 바꿔서 찍긴 했지만 실제 값이 바뀌는 건 아님
        String e = d.replace("Java", "Python"); // 스트링 문자열을 대체
        System.out.println(e); // 실제 값이 바뀜

        // replaceAll() : 정규식(정규표현식, 패턴? ex) 전화번호 규격이 000-0000-0000의 형태인 것) 적용 가능
        String f = "안녕하세요 Java Java를 공부하겠습니다.";
        System.out.println(f.replace("Java", "Python"));
        System.out.println(f.replaceAll("Java", "Python")); // 위 replace()와 차이 없이 Java라는 문자열 모두 Python이라고 일괄 변경됨

        // substring() : 문자열에서 특정 문자열을 뽑아냄, 파이썬의 슬라이싱
        String g = "Hello Java";
        System.out.println(g.substring(6)); // Java, 6번째 인덱스부터 끝까지
        System.out.println(g.substring(6, 8)); // Java, 6번째 인덱스부터 8번째 인덱스 미만까지(7번째 인덱스까지)
        System.out.println(g.substring(0,5)); // Hello, 0번째 인덱스부터 5번째 인덱스 미만까지(파이썬의 경우에 0은 생략이 됐음, 콜론으로 범위 표현)

        // toUpperCase() : 문자열을 모두 대문자로 반환
        // toLoserCase() : 문자열을 모두 소문자로 반환
        System.out.println(g.toUpperCase());
        System.out.println(g.toLowerCase());

        // trim() : 문자열의 앞/뒤의 공백 제거
        String h = "    안녕하세요, 오늘은 날씨가 좋아요.       ";
        System.out.println(h.trim());

        // split() : 문자열을 특정 문자열 기준으로 분리하는 메서드
        String i = "23:45:56";
        String[] timeStr = i.split(":"); // 카멜표기법이라 time_str 대신 timeStr이라고 씀
        for (String el : timeStr) { // 문자열 배열 출력을 위한 for문
            System.out.print(el + " ");
        }
        System.out.println(); // 공백출력
        System.out.println(timeStr[0] + "시" + timeStr[1] + "분" + timeStr[2] + "초");

        // 문자열 포매팅 : 서식을 지정해서 문자열을 만드는 것 (2가지방법: System.out.printf, String.format)
        System.out.printf("오늘의 온도는 %d입니다.\n", 35); // 화면 출력을 위한 서식을 만들 때 사용
        String.format("오늘의 온도는 %d입니다.\n", 35); // 화면 출력은 안됨, 또다른 문자열을 만들기 위해 사용
        String otherStr = String.format("오늘의 온도는 %d입니다.\n", 35); // 또다른 문자열을 만들어주고 아래에서 출력
        System.out.println(otherStr); // 복잡한 문자열을 먼저 입력받고 나중에 사용하거나 할 때 가끔 사용

        // toCharArray() : 문자열을 문자 배열로 반환
        String strVal = "I saw you.";
        char[] chArray = strVal.toCharArray(); // 배열로 만들어줌
        for (char ec : chArray) { // 배열이니 순회를 할 수 있음 for문으로 돌려보기
            System.out.print(ec + " ");
        }

         */



        /*

        // 실습문제 1 : 대문자, 소문자로 이루어진 문자열을 입력받아
        // 대문자는 소문자로, 소문자는 대문자로 변경
        // 아스키코드는 A가 65, 대문자가 소문자보다 앞, a - A = 32(대소문자 차이는 32)

        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        String phrase = sc.next(); // 문자열 입력받기

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            // a보다 아스키코드값이 작다면(대문자라면) 소문자와 대문자의 아스키코드값 차이만큼 더해줌(소문자로 바꿔줌)
            if (ch < 'a')  System.out.print((char)(ch + ('a' - 'A'))); // 차이가 32라서 'a' - 'A' 대신 그냥 32 써줘도 됨
            // 아니라면(소문자라면) 소문자와 대문자의 아스키코드값 차이만큼 빼줌(대문자로 바꿔줌)
            else System.out.print((char)(ch - ('a' - 'A'))); // 대문자가 소문자보다 앞에 있다, A는 65
        }

         */


        /*
        // 실습문제 2 : 입력받은 문자열을 반대로 출력하기
        // ex) abcdef > fedcba

        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        String phrase = sc.next(); // 문자열 입력받기

        for (int i = phrase.length() - 1; i >= 0; i--) { // 인덱스라서 길이-1이 맨 마지막 문자, 0까지 돌아야 되니까(참인 동안), 종료 지점이라기보다 순회 조건(조건식)이라고 이해하면 될듯..
            System.out.print(phrase.charAt(i));
        }
        */

        /*
        // 실습문제 2) while문으로 풀어보기

        Scanner sc = new Scanner(System.in);
        String phrase = sc.next();

        int pos = phrase.length() - 1; // 맨 뒤 문자부터 (인덱스)
        while (true) {
            System.out.print(phrase.charAt(pos));
            pos--; // pos 하나씩 뺴가면서 출력
            if (pos < 0) break; // 0보다 작아지면(인덱스 0까지 하고) 종료
        }
        */


    }
}
