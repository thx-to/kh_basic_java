package 연산자연습_04_240924;
// 산술연산자 : +, -, *, /, % (// 몫 구하기, ** 제곱 없음, 제곱은 따로 pow 메서드 사용)
// 대입연산자 : =, +=, -=, *=, /=, %=
// 증감연산자 : ++, -- (현재 값에서 1을 증가시키거나 감소시키는 역할)
// 비교연산자 : >, <, >=, <=, !=, ==
// 논리연산자 : &&(and), ||(or), !(not)
// 삼항연산자 : 조건식 ? 참인 경우 수행 구문 : 거짓인 경우 수행 구문
// 비트연산자 : 비트 단위의 저수준 조작을 하기 위한 연산자


import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {


        /*
        // 산술연산자 : 사칙연산을 다루는 연산자

        int num1 = 10, num2 = 4;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); // 정수끼리 나눗셈을 수행하면 몫이 구해짐 (정수끼리 나누면 소숫점 이하가 생기지 않음)
        System.out.println((double)num1 / num2); // 소숫점까지 구하기 위해 형변환해줌
        System.out.println((double)(num1 / num2)); // 이렇게하면 이미 정수로 나눈 소숫점 없는 값에 double이 붙는거라서 효과가 없음
        System.out.println(num1 % num2);

        int num3 = 10, num4 = 0;
        System.out.println(num3 + num4);
        System.out.println(num3 - num4);
        System.out.println(num3 * num4);

        // 좌측 피연산자가 정수 타입인 경우 나누는 수인 우측 연산자는 0을 사용할 수 없음
        // 10 / 0 = Infinity (무한대)
        // 10 % 0 = NaN (Not a Number)
        try {
            System.out.println((double) num3 / num4); // 소숫점까지 구하기 위해 형변환해줌
            System.out.println(num3 % num4);
        // ArithmeticException : 나누기 0을 하면 발생하는 오류
        } catch (ArithmeticException e) { // ArithmeticException이라는 클래스에 대해 e라는 참조 변수를 만든 것
            System.out.println("0을 나눌 수 없습니다.");
        }


        // 증감연산자 : 해당 변수값을 1 증가 또는 감소시키는 연산자
        // 후위증가연산자 : 먼저 대입 후 증가 (해당하는 값을 먼저 찍음, 선대입 후반영)
        // 전위증가연산자 : 먼저 증가 후 대입 (선반영 후대입)
        System.out.println(num1++); // 후위증가연산자, 10을 먼저 찍고 아직 대입을 안해서 10이 찍힘
        System.out.println(++num1); // 전위증가연산자, 증가를 먼저함
        System.out.println(num1);


        // 대입연산자 : 우변의 값을 좌변에 대입
        System.out.println(num1 += 2); // num1 = num1 + 2
        System.out.println(num1 -= 2); // num1 = num1 - 2
        System.out.println(num1 *= 2); // num1 = num1 * 2
        System.out.println(num1 /= 2); // num1 = num1 / 2


        // 비교연산자 : 두개의 피연산자를 비교하여 어느 쪽이 큰지, 작은지 아니면 서로 같은지를 판단
        // 결과값은 boolean값으로 반환 (True / False)
        int x = 10, y = 20;
        System.out.println(x > y); // False
        System.out.println(x < y); // True
        System.out.println(x == y); // False
        System.out.println(x != y); // True
        System.out.println(x >= y); // False
        System.out.println(x <= y); // True


        // 논리연산자
        // &&(and) : A와 B를 모두 만족해야 참
        // ||(or) : A와 B 중 하나를 만족하면 참
        // !(not) : 현재의 조건을 부정, 반대

        // boolean값으로 rst1, rst2, rst3를 각각 선언함
        boolean rst1;
        boolean rst2;
        boolean rst3;

        rst1 = (x > 0) && (x > y); // False, 앞은 참 뒤는 거짓
        rst2 = (x > 0) || (x > y); // True, 앞은 참, 뒤는 거짓
        rst3 = !((x > 0) || (x > y)); // False, rst2의 반대
        // 공백을 사이에 두고 출력, 아니면 오류남..
        System.out.println(rst1 + " " + rst2 + " " + rst3);


        // 삼항연산자
        // 조건식 ? 참인 경우 수행 : 거짓인 경우 수행
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        String isAdult = (age > 19) ? "성인" : "미성년자";
        System.out.println("당신은 " + isAdult + " 입니다.");


        // 연산자 우선순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        System.out.println(val1 + val2 * val3);
        System.out.println((val1 + val2) * val3);
        System.out.println((val1 + (++val2)) * val3);
        */


        // 3자리 정수를 입력받아 3개(100의 자리, 10의 자리, 1의 자리)의 변수에 나누어 담아서 출력하기

        /*
        // 해보려고한거 1 char로 받고 싶었는데 입력이 세번 필요함
        Scanner sc = new Scanner(System.in);

        System.out.print("3자리 정수를 입력하세요 : ");
        char hun = sc.next().charAt(0);
        char ten = sc.next().charAt(1);
        char one = sc.next().charAt(2);

        System.out.println("백의 자리 : " + hun);
        System.out.println("십의 자리 : " + ten);
        System.out.println("일의 자리 : " + one);
        */

        /*
        // 해보려고한거 1 피드백을 받았는데 더 어렵당..ㅎㅎ. for문 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("3자리 정수를 입력하세요 : ");
        String num = sc.next();

        for (int i = 0; i < num.length(); i++) {
        char ch = num.charAt(i);
        System.out.print(ch + " ");
        }
        */

        /*
        // 해보려고한거 1 피드백 이게진짜
        Scanner sc = new Scanner(System.in);

        System.out.print("3자리 정수를 입력하세요 : "); // 입력받은 값은 num 1개임
        String num = sc.next(); // 1개의 num을 통일해서 앞에 써주고, 뒤에 sc.next() 대신 num으로 써줌

        char hun = num.charAt(0); // 앞에 1개의 num을 통일해서 써주고, sc.next() 대신 num으로 써줌
        char ten = num.charAt(1);
        char one = num.charAt(2);

        System.out.println("백의 자리 : " + hun);
        System.out.println("십의 자리 : " + ten);
        System.out.println("일의 자리 : " + one);
        */

        /*
        // 해보려고한거 2 성공
        Scanner sc = new Scanner(System.in);

        System.out.print("3자리 정수를 입력하세요 : ");
        int num = sc.nextInt();

        int hun;
        int ten;
        int one;

        hun = num / 100; // 요 앞에 int만 붙여줬으면 위 세개가 필요없었다..
        ten = (num % 100) / 10;
        one = num % 10;

        System.out.println("백의 자리 : " + hun);
        System.out.println("십의 자리 : " + ten);
        System.out.println("일의 자리 : " + one);
        */

        /*
        // 강사님 답
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt(); // Scanner 클래스로 만들어진 인스턴스 메서드
        int a = num / 100; // num값을 100으로 나눈 몫(정수형 연산이기 때문에) # 몫을 구하는 연산자가 따로 필요 없음
        int b = (num % 100) / 10; // num값을 100으로 나눈 나머지인 56을 다시 10으로 나눈 몫
        int c = num % 10; // num값을 10으로 나눈 나머지
        System.out.printf("백의 자리 %d 십의 자리 %d 일의 자리 %d\n", a, b, c);
        */

    }
}

