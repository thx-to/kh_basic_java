package 시스템입출력_01_240924;

import java.util.Scanner;

// 파이썬이나 C/C++은 함수가 클래스 내부에 존재할 수 있고, 메서드라고 부름
// 자바는 모든 함수가 (시스템)클래스 내부에 있어야 함

// 자바 표준 입출력 클래스 : System.in(표준 입력), System.out(표준 출력), System.err(표준 오류)
// System.in(표준 입력) : 프로그램 내에서 사용자의 입력을 받음 (콘솔로부터)
// System.out(표준 출력) : 프로그램 내의 결과를 콘솔에 출력
    // print : 메서드 오버로딩 지원
    // println : 메서드 오버로딩 지원
    // printf : 서식지정자

    // 서식지정자
    // %d : Decimal, 10진수 표시
    // %ld : Long Decimal
    // %f : Float
    // %.2f : Float, 소숫점 2자리까지 표시
    // %2d : 2칸의 공간을 잡고 오른쪽 정렬
    // %-2d : 2칸의 공간을 잡고 왼쪽 정렬
    // %s : String, 문자열
    // %c : Character, 문자
    // %% : % 기호를 출력

    // 이스케이프 시퀀스
    // \n : New line, 줄바꿈
    // \r : carriage Return, 커서를 맨 앞으로 이동
    // \t : Tab, 탭 키만큼 수평으로 띄움
    // \b : Backspace, 바로 앞 문자를 하나 지움
    // \\ : \ 기호를 출력 (폴더 경로 구분시 많이 사용)

// System.err(표준 오류) : 오류를 출력하기 위해서 사용 (잘 사용하지 않음, 오류 출력시 System.out을 많이 사용함)

public class SystemInOutEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "쿵";
        String addr = "서울시 강남구";
        char gender = 'F';
        int age = 34;
        int kor = 99;
        int eng = 100;
        int mat = 80;// 콘솔로부터 입력받음

        // println(), print() : 메서드 오버로딩이 됨
        System.out.println("===== Java Style 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));
        // 명시적 형변환(double로 감싼 소괄호, 세 수를 더한 값에 더블을 붙여서 형변환)과 묵시적 형변환(3으로 나눈 값도 double로 바뀜)이 동시에 일어남
        // 묵시적 형변환은 컴파일러가 유리한 방향으로 알아서 형변환
        System.out.println("평균 : " + (double)(kor + eng + mat) / 3); // double로 형변환, 나누면 소숫점 아래가 생길 수 있으니까
        System.out.println(String.format("평균 : %.2f", (double)(kor + eng + mat) / 3)); // 서식(format) 지정 형태로도 가능하나 아래 printf가 더 짧고 간편함

        // 서식 지정자 스타일
        System.out.printf("===== C Style 출력 =====\n");
        System.out.printf("이름 : %s\n", name); // %s는 문자열에 대한 서식
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat) / 3);

    }
}
