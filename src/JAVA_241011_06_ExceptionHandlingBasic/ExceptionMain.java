package JAVA_241011_06_ExceptionHandlingBasic;
// 프로그램에서 오류가 발생하는 경우는 크게 두 가지
// 1) 컴파일 오류 : 문법을 잘못 작성하는 경우
// 2) 런타임 오류 : 실행 중 오류가 발생하는 경우
// 런타임 오류가 컴파일 오류보다 심각한 문제

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
            // catch (Exception e) 이렇게 써도 됨, Exception은 모든 예외의 최상위 클래스이기 때문에 어떤 예외가 와도 다 잡아줌
        } catch (ArrayIndexOutOfBoundsException e) {
            // e(예외의 이름)을 같이 출력해줌
            System.out.println(e + " 인덱스가 배열의 범위를 벗어났습니다.");
        }
        System.out.println(); // 단순개행

        // try catch 없이 이렇게만 돌릴 경우 ArrayIndexOutOfBoundsException
        // int[] arr = new int[5];
        // for (int i = 0; i <= 5; i++) {
        //     arr[i] = i;
        //     System.out.println(arr[i]);

        // fileNotFoundFunc 호출
        fileNotFoundFunc();

        // nullPointerFunc 호출
        nullPointerFunc();

        // arithmeticFunc 호출
        arithmeticFunc();
    }

    static void fileNotFoundFunc() {

        // FileNotFoundException
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e + " 해당 파일이 없습니다. 계속 진행하시겠습니까?");
        }
        System.out.println(); // 단순개행
    }

    static void nullPointerFunc() {

        // NullPointerException
        // 여기서의 null값은 아직 참조하는 객체가 없음을 의미
        Test test = null;

        try {
            System.out.println(test.name);
        } catch (NullPointerException e) {
            System.out.println(e + " 참조하고자 하는 객체가 생성되지 않았습니다.");
        }

        if (test != null) {
            System.out.println(test.name);
        } else {
            System.out.println("test가 없습니다.");
        }
        System.out.println(); // 단순개행
    }

    static void arithmeticFunc() {

        Scanner sc = new Scanner(System.in);

        // ArithmeticException
        // 두번째 값(나누는 수)에 0 입력시 ArithmeticException 발생
        // 두번째 값(나누는 수)에 문자 입력시 InputMismatchException 발생
        int rst = 0;

        try {
            System.out.print("첫번째 값 : ");
            int a = sc.nextInt();
            System.out.print("두번째 값 : ");
            int b = sc.nextInt();
            rst = a / b;
            System.out.println(rst);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e + " 오류 발생");
        } finally {
            System.out.println("무조건 수행되는 구문");
        }
    }

}

class Test {
    String name = "PHAM";
}

