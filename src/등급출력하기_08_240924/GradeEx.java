package 등급출력하기_08_240924;
// 국어, 영어, 수학 성적을 받아서 평균을 구하고
// 평균이 90점 이상이면 A
// 평균이 80점 이상이면 B
// 평균이 70점 이상이면 C
// 평균이 60점 이상이면 D
// 나머지는 F
// 각각의 성적은 0~100으로 입력되어야 함
//입력값이 잘못된 경우 재입력 받기

import java.util.Scanner;

public class GradeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 성적 : ");
        int kor = sc.nextInt();
        System.out.print("영어 성적 : ");
        int eng = sc.nextInt();
        System.out.print("수학 성적 : ");
        int mat = sc.nextInt();



        /*
        // 스위치를 써보려했는데 안되는건가봐
        float avr = (kor + eng + mat) / 3;

        switch (avr) {
            case (avr >= 90) : System.out.println("A"); break;
            case (avr >= 80) : System.out.println("B"); break;
            case (avr >= 70) : System.out.println("C"); break;
            case (avr >= 60) : System.out.println("D"); break;
            case (avr < 60) : System.out.println("F"); break;
            default : System.out.println("성적을 잘못 입력하셨습니다.");
        }
        */

        /*
        // if로 해보려고 한거 - 각 성적의 범위와 잘못 입력한경우 재입력하는 폼이 없음
        float avr = (kor + eng + mat) / 3;
        if (avr >= 90) System.out.println("A");
        else if (avr >= 80) System.out.println("B");
        else if (avr >= 70) System.out.println("C");
        else if (avr >= 60) System.out.println("D");
        else if (avr < 60) System.out.println("F");
        else System.out.println("성적을 잘못 입력하셨습니다.");
         */

        /*
        // 강사님의 코드 배끼기
        // 정답 아니었음.. int로 받아서 어차피 계산도 정수가 되니까 avr를 float으로 잡아도 소용이 없는 것임..
        // 코드 돌려보면 무조건 소숫점 아랫자리 안나오니까 궁금하면 확인해보면됨.
        float avr = (kor + eng + mat) / 3; // 이건 내꺼
        if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (mat < 0 || mat > 100)) {
            System.out.print("성적을 잘못 입력하셨습니다."); // 범위만 따라했음
        } else {
            if (avr >= 90) System.out.println("A");
            else if (avr >= 80) System.out.println("B");
            else if (avr >= 70) System.out.println("C");
            else if (avr >= 60) System.out.println("D");
            else  System.out.println("F");
        } // 요 코드는 위에서 내가 만든 코드 가져옴
        System.out.print(avr); // 혹시나(소숫점 아래 나오나)해서 평균값 출력해봄
        */


        // 강사님 코드만 써보기
        if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (mat < 0 || mat > 100)) {
            System.out.print("성적을 잘못 입력하셨습니다."); // 범위만 따라했음
        } else {
            double avr = (double)(kor + eng + mat) / 3;
            if (avr >= 90) System.out.println("A");
            else if (avr >= 80) System.out.println("B");
            else if (avr >= 70) System.out.println("C");
            else if (avr >= 60) System.out.println("D");
            else  System.out.println("F");
        }


        /*
        // 강사님 코드만 써보기 - 평균 출력해보기
        if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (mat < 0 || mat > 100)) {
            System.out.print("성적을 잘못 입력하셨습니다."); // 범위만 따라했음
        } else {double avr = (double)(kor + eng + mat) / 3;
            System.out.print(avr);}
         */


    }
}

