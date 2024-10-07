package JAVA_240924_02_Scanner;
// 기본적인 데이터 타입에 대한 입력을 Scanner 클래스의 메서드를 사용하여 입력받기

import java.util.Scanner; // 스캐너 클래스는 util 패키지 내에 존재하므로 import 해야함
// import하지 않으려면 매 사용시마다 java.util.Scanner 이런식으로 기재해줘야함
// 사용시 아래 출력되는 리스트에서 Scanner 선택하니까 import 자동으로 입력됨

public class ScannerEx {
    public static void main(String[] args) {
        // sc : Scanner 클래스에 대한 참조 변수 (Scanner 클래스로 만들어진 객체의 주소)
        // sc는 지역 변수기 때문에 중괄호를 만나면 사라짐, 블록스코프
        // new : Heap 메모리 영역(동적 메모리 할당)에 객체의 메모리를 할당하기 위한 키워드, Heap 영역은 메모리 해제가 필요함
        // new 키워드로 Heap 메모리 할당이 됐다 = "인스턴스화 되었다", "객체가 만들어졌다'
        Scanner sc = new Scanner(System.in); // 콘솔로부터 표준입력을 받기 위한 객체로 생성(System.in)

        byte a = sc.nextByte(); // byte형 입력 및 리턴
        short b = sc.nextShort(); // short형 입력 및 리턴
        int c = sc.nextInt(); // int형 입력 및 리턴
        long d = sc.nextLong(); // long형 입력 및 리턴
        // Scanner는 문자에 대한 입력 받식이 없음
        // next() : 공백 기준으로 문자열을 입력받아 charAt(인덱스) 해당 인덱스의 문자를 추출
        // 입력을 한글자만 받아도 되고, 문자열을 받으면 charAt(0)에서 맨 첫글자만 추출
        char ch = sc.next().charAt(0); // 문자 입력
        float e = sc.nextFloat();
        double f = sc.nextDouble();
        boolean g = sc.nextBoolean();

        String h = sc.next(); // String형 입력 및 리턴, 공백 기준으로 한 단어로 보는 문자열을 입력받음
        String i = sc.nextLine(); // String형 입력 및 리턴, 줄바꿈 기준으로 한 줄로 보는 문자열을 입력받음

;    }
}
