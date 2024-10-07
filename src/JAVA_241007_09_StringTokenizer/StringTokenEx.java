package JAVA_241007_09_StringTokenizer;
// String Tokenizer : 문자열을 특정 구분자 기준으로 쪼개서 부분 문자열로 만듦
// String.split()을 사용하는 방식이 더 좋음(이후에 나옴)
// countTokens() : 꺼내지 않고 남은 토큰의 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인
// nextToken() : 토큰을 하나씩 빼옴

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {

        tokenFunc();
        splitFunc();
        classFunc();

    }


    // 예전 방식
    static void tokenFunc() {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 / 기준으로 입력하세요 : ");
        String name = sc.nextLine();

        // StringTokenizer라는 객체를 먼저 만들어줌
        StringTokenizer st = new StringTokenizer(name, "/");

        // 문자열 배열의 크기를 정함
        String[] nameSub = new String[st.countTokens()];

        int idx = 0;

        // name을 쪼갠 문자열 배열 만들기
        // 남아있는 토큰이 있는지의 여부를 가지고 while문을 돌림
        // 조건문의 반복 여부를 hasMoreTokens의 반환값으로 결정
        while (st.hasMoreTokens()) {
            nameSub[idx++] = st.nextToken();
        }

        // 출력
        System.out.println(Arrays.toString(nameSub));

    }


    // 요즘 방식
    static void splitFunc() {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 / 기준으로 입력하세요 : ");
        String name = sc.nextLine();

        // name.split("[/,;]") 이런식으로 정규표현식 사용 가능
        // 정규표현식 내 모든 문자열로 구분 및 split 가능
        String[] nameSub = name.split("/");
        System.out.println(Arrays.toString(nameSub));

    }




    // Class 클래스
    static void classFunc() {
        Student student = new Student();
        System.out.println(student.getClass());
    }
}

class Student {
    String name = "PHAM";
}
