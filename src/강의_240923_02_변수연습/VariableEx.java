package 강의_240923_02_변수연습;
// 변수란 값을 저장할 수 있는 메모리 공간에 이름을 붙여놓은 것
// 자바는 JVM이 미리 운영체제로부터 메모리를 확보받고 재할당해주는 개념
// 자바는 데이터형이 존재하기 때문에 사용 목적에 맞는 데이터 타입을 선언해야 함
// 특수문자 중 $(달러)도 사용 가능(언더바와 달러 두가지 사용), 파이썬은 언더바만 가능
// 키워드 사용 안됨, 숫자가 앞에 오면 안됨, 공백 안됨
// camel 표기법 사용 (파이썬은 snake 표기법)
// 변수 이름은 사용 목적에 맞게 지어야 함

public class VariableEx {
    public static void main(String[] args) {

        // 변수 선언만 하는 경우 (자바는 선언만 할 수도 있음, 파이썬은 값이 대입될 때 형이 결정되기 때문에 값이 없이 선언만 할 수는 없음)
        // 지역 변수의 특징 : 자동 소멸, 자동으로 초기화가 안돼서 수동으로 해줘야 함
        /*
        int age;
        String name;
        char gender;
        double avg;
        */

        // 변수 설정과 동시에 값을 할당하는 경우
        /*
        int age = 23;
        String name = "쿵";
        double avg = 23.99;
        System.out.println(avg);
        */

        /*
        // 논리형 변수 선언
        boolean isTrue;

        // 정수형 변수 선언
        byte bNum;
        short sNum;
        int iNume;
        long lNum;

        // 문자형 변수 선언
        char ch;

        // 문자열 변수 선언
        String str;

        // 실수형 변수 선언
        float fNum;
        double dNum;


        int num1, num2;                  // 같은 타입의 변수를 동시에 선언함.
        double num3 = 3.14;              // 선언과 동시에 초기화함.
        double num4 = 1.23, num5 = 4.56; // 같은 타입의 변수를 동시에 선언하면서 초기화함.

        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간" + minute + "분");
        */

        // 변수의 사용 범위 : 자바는 블록스코프(블록이 변수의 생명주기) 언어이기 때문에 중괄호{} 블록 내에서 사용되고 소멸됨
        /*
        int n = 20; // 밖의 n
        {
            int m = 30; // 중괄호 안의 m
            System.out.println(n + m); // 밖의 n과 중괄호 안의 m을 더함
        } // 중괄호 벗어나서 m 소멸
        int m = 50; // 새로운 m 변수 생성
        System.out.println(n + m); // n과 새로운 m을 더함
        */

        /*
        //오버플로우
        byte num1 = 127;
        num1++;
        System.out.println(num1); // 오버플로우 : 출력 범위를 넘어감

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);
        char ch2 = 66;
        System.out.println(ch2);
        */

        /*
        // 문자 자료형
        char ch1 = 'A'; // 단일 문자를 저장

        System.out.println(ch1);  // 문자 출력
        System.out.println((int)ch1); // 문자에 대한 정수(ASCII)값 출력

        char ch2 = 66;
        System.out.println(ch2);

        System.out.printf("%c\n", ch2);
        System.out.printf("%d\n", (int)ch2);
         */

        /*
        // 부동 소수점 (근사치계산법)
        double pie = 3.141592;

        // 부동 소수점 방식의 오류
        double num10 = 0.0;
        for(int i = 0; i < 1000 ; i++) {
            num10 += 0.1; // 0.1씩 1000번을 더함
        }
        System.out.println(num10);
        */
    }

}
