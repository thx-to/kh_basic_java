package 강의_240925_01_반복문;
// 반복문 : 주어진 조건이 참인 동안 혹은 정해진 횟수만큼 반복적으로 프로그램을 수행하는 것
// while문, do ~ while문, for문(범위range 기반의 for문, 인덱스가 움직이는), Enhanced for문(시퀀스형 데이터를 돌릴 때 사용하는 for문, 향상된 for문, 요소의 개수를 자동 순회)

// 반복문 돌릴 때 반복문 밖에서 변수 선언해주기, 안이든 밖이든 지역변수
// 반복문 내부에서 변수 선언하면 계속 호출되고 매번 새롭게 변수가 만들어지니까
// 밖에서 변수 미리 선언해두고 아래에서 다시 새롭게 만들지 않고 재활용하게 하는게 효율적
// ex1) 반복문 내부 age 변수선언 : int age = sc.nextInt();
// ex2) 반복문 외부 int age;, 반복문 내부 age = sc.nextInt();
// ex1과 ex2는 형태는 다른데 실제 수행 내용은 같음

import java.util.Scanner;

public class IteratorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        // 1 ~ n까지의 숫자 더하기 while문
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0; // 값을 누적하기 위한 변수
        while (n > 0) { // while(n) 이라고 하면 오류 / 자바는 0과 1값을 주는게 아니고 boolean을 봄 / 파이썬은 true가 1, false가 0이지만 자바는 그렇게 보지 않음
            sum += n; // sum에 누적하기, sum = sum + n, 복합대입연산자
            n--; // n = n - 1, 증감연산자, 값을 대입하지 않으면 전위/후위 상관 없이 값이 감소됨
        }
        System.out.println("합계 : " + sum);

        // 만약 n에 3을 대입했다면
        // 초기 sum은 0, n은 3
        // sum = 0 + 3 = 3
        // n--;로 n에 1을 빼줌 (증감연산자)
        // 현재 sum은 3, n은 2
        // sun = 3 + 2 = 5
        // n--;로 n에 1을 빼줌 (증감연산자)
        // 현재 sum은 5, n은 1
        // sum = 5 + 1 = 6

         */

        /*
        // 1 ~ n까지의 숫자 더하기 for문
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i < n + 1; i++) {
            sum += i;
        }
        System.out.println("합계 : " + sum);
         */

    }
}
