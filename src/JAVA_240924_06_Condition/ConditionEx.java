package JAVA_240924_06_Condition;
// 제어문 : 프로그램의 순차적인 흐름을 제어할 때 사용
// 제어문에는 조건문과 반복문이 있음
// 조건문 : if, if else, if else if else, switch case문(조건식은 올 수 없고 값만 올 수 있음), 삼항연산자

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 입력 : ");
        int num = sc.nextInt(); // 스캐너를 통해 정수값 입력받음

        if (num >= 0) {System.out.println("양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }

        // 100인 경우 출력이 정상적으로 되지 않음
        System.out.print("정수값 입력 : ");
        int n = sc.nextInt();

        if (n > 100) {
            System.out.println(n + "이 100보다 커요.");
        } else {
            System.out.println(n +"이 100보다 작아요.");
        }

        // 100은 100이라고 출력
        System.out.print("정수값 입력 : ");
        int m = sc.nextInt();
        // 조건문 내의 코드가 한줄인 경우(세미콜론;이 하나인 경우)는 {} 생략 가능
        if (m > 100) System.out.println(m + "이 100보다 커요");
        else if (m < 100) System.out.println(m + "이 100보다 작아요.");
        else System.out.println(m + "은 100이에요.");


        // 입력받은 문자가 대문자인지 소문자인지 출력하기
        System.out.print("문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.print(ch + "는 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') { // 대문자 A는 ASCII 코드로 65
            System.out.println(ch + "는 대문자입니다.");
        } else {
            System.out.println(ch +"는 알파벳이 아닙니다.");
        }

    }
}
