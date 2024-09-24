package 입력받기연습_03_240924;

// 이름 : String Type, next() 공백 기준으로 문자열 입력
// 주소 : String Type, nextLine() 줄바꿈 기준으로 문자열 입력 (문자열에서 줄바꿈문자까지 읽어들임)
// 성별 : Character Type, next().charAt(0) 문자열에서 0번째 인덱스(첫번째 문자) 추출
// 나이 : Integer, nextInt() 정수를 입력받음
// === 회원 정보 출력 ===
// 이름 :
// 주소 :
// 성별 :
// 나이 :

import java.util.Scanner;

public class ScannerInputEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 여기에서 이름 입력하고 개행(줄바꿈, 엔터)하면 '주소를 입력하세요 : 성별을 입력하세요 : ' 라고 출력되는 오류
        // 여기에서 사용자가 입력한 개행문자를 빼주는 작업이 필요 (개행문자가 버퍼에서 빠져나가지 않았음)
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine(); // 여기서 개행문자를 읽어들이고 지우기 (버퍼지우기), 발생할 때마다 넣어주면 됨 (주로 next()에서 발생함)
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("=== 회원 정보 출력 ===");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
    }
}
