package JAVA_240924_10_상근이알람예제;
// 스캐너 객체 생성
// 시간 입력 :
// 분 입력 :
// 시간과 분을 분으로 환산
// 계산된 분이 45 미만이면 하루의 시간을 더해줌
// 계산된 시간에서 45를 빼줌
// 다시 시간과 분으로 환산해서 결과 출력

import java.util.Scanner;

import static java.lang.System.*;

public class AlarmEx {
    public static void main(String[] args) {


        // 내코드
        Scanner sc = new Scanner(in); // 스캐너 객체 생성

        System.out.print("알람 시간 입력 : ");
        int hour = sc.nextInt();
        System.out.print("알람 분 입력 : ");
        int minute = sc.nextInt();

        int hm = (hour * 60) + minute; // 시간과 분을 분으로 환산
        int am = hm - 45; // 분으로 환산된 시간에서 45를 빼줌 : 알람 설정할 시간이 분으로 환산된 버전

        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute < 60)) { // 시간은 0에서 23까지, 분은 0에서 59까지
            if (am >= 0) { // 분으로 환산된 조정시간이 0보다 크거나 0과 같으면
                System.out.println((am / 60) + "시 " + (am % 60) + "분으로 알람이 설정되었습니다."); // 시간과 분으로 바로 출력
            } else { // 아니면 : 0보다 작으면
                System.out.println(((am + 1440) / 60) + "시 " + (am + 1440) % 60 + "분으로 알람이 설정되었습니다."); // 분으로 환산된 하루의 시간(24시간 * 60분)을 더해주고 시간과 분으로 출력
            }
        } else {
            System.out.print("시간을 잘못 입력하셨습니다.");
        }


        /*
        // 강사님코드
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt(); // 시간 입력
        int min = sc.nextInt(); // 분 입력
        int calc = hour * 60 + min; // 시간과 분을 분으로 환산
        if (calc < 45) { // 환산된 분이 45 미만이면
            calc = 24 * 60 + min; // 하루만큼의 시간을 환산된 분으로(24*60) 더해줌
        }
        calc -= 45; // 계산된 시간에서 45를 빼줌
        System.out.printf("%d시 %d분\n", (calc / 60), (calc % 60)); // 다시 시간과 분으로 환산해서 결과 출력
        */


    }
}
