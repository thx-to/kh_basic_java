package 강의_240925_02_while반복문;
// while문 : 주어진 조건이 참인 동안 반복, 횟수가 정해지지 않은 경우에 많이 사용
// do ~ while문 : 선실행 후조건비교

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        // while문으로 나이 입력
        int age;
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if (age >= 0 && age <= 200) break; // 정상적인 값이 입력되면 탈출
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
        */

        /*
        // do ~ while문으로 나이 입력
        int age;
        do {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
        } while (age < 0 || age > 200);
        System.out.println("당신의 나이는 " + age + "살 입니다.");
        */



    }
}
