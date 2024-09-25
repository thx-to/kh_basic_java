package 강의_240924_09_스위치문계산기;
// 스위치문으로 간단한 계산기 만들기

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("좌변 : ");
        int x = sc.nextInt(); // 좌변

        System.out.print("연산자 : ");
        char op = sc.next().charAt(0); // 연산자

        System.out.print("우변 : ");
        int y = sc.nextInt(); //우변


        switch (op) {
            case '+' : System.out.println("덧셈을 수행합니다 : " + (x + y)); break;
            case '-' : System.out.println("뺄셈을 수행합니다 : " + (x - y)); break;
            case '*' : System.out.println("곱셈을 수행합니다 : " + (x * y)); break;
            case '/' : System.out.println("나눗셈을 수행합니다 : " + (x / y)); break;
            default : System.out.println("조건식이 없습니다.");
        }
    }
}
