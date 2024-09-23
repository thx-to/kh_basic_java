package 상수와리터럴_03_240923;

import java.util.Scanner;

// 상수란 : 메모리에 값이 한번 지정되면 변경할 수 없음
// 자바에서는 final이라는 키워드를 사용 (대부분의 언어에서는 const)
// 상수는 관례상 모두 대문자로 선언

public class ConstEx {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // 일반적으로는 카멜표기법으로 taxRate으로 표현, 상수로 표현하기 때문에 관례상 다 대문자로 넣음
        // 콘솔(터미널 모드)에서 입력받기 위해서는 Scanner 클래스에 대한 객체를 생성해야 함 (Scanner 객체-클래스를 실체화시킨 것-를 만들어야 함)
        // Heap 영역에 동적으로 메모리를 확보받음
        // Scanner를 참조변수로 만들고(위치는 지역변수) int형으로 입력받아서 income이라는 변수에 넣어줌
        // 앞에 final 키워드로 고정해줌
        Scanner sc = new Scanner(System.in); // new : 동적 할당
        System.out.print("수입을 입력하세요 : ");
        int income = sc.nextInt(); // 정수를 입력받겠다고 알려줘야함
        System.out.println("당신이 내야 할 세금은 " + income * TAX_RATE);

        // TAX_RATE = 0.08; // 위에 final로 상수 고정해줬기 때문에 변경할 수 없다는 오류 출력
        System.out.printf("당신이 내야 할 세금은 %.2f", income * TAX_RATE);
    }
}
