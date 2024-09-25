package 강의_240925_10_평균점수구하기;
// 학생 수 5명에 대한 성적 입력받기 (5줄로 입력)
// 입력받은 성적 중 40점 미만이 있으면 40점으로 올림 (보충학습 듣는 조건으로)
// 올린 후 평균점수 구하기
// 점수는 모두 0점 이상 100점 이하인 5의 배수, 따라서 평균 점수는 항상 정수

import java.util.Scanner;

public class AverEx1 {
    public static void main(String[] args) {

        /*
        // 해보려고한거
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];

        System.out.print("성적 입력 1 : ");
        score[0] = sc.nextInt();
        System.out.print("성적 입력 2 : ");
        score[1] = sc.nextInt();
        System.out.print("성적 입력 3 : ");
        score[2] = sc.nextInt();
        System.out.print("성적 입력 4 : ");
        score[3] = sc.nextInt();
        System.out.print("성적 입력 5 : ");
        score[4] = sc.nextInt();

        for (int i = 0; i < score.length; i++) {
            if (score[i] < 40) {
                score[i] = 40;
            }
            System.out.print(score[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < score.length; i++) {

        }
        */

        /*
        // 강사님 해설

        // 입력을 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 성적을 입력받기 위한 정수형 배열 생성
        int[] score = new int[5];
        int total = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] < 40) score[i] = 40; // 반복문을 순회하면서 입력받은 성적이 40 미만이면 40으로 변경
            total += score[i]; // 배열의 요소값을 더해서 총점 구하기
        }

        // 소숫점 이하가 없으므로 정수값으로 평균 출력하기
        System.out.println(total / 5);
        */


        /*
        // 강사님 해설 보고 내 코드 수정해보기 // OK!
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int sum = 0;

        System.out.print("성적 입력 1 : ");
        score[0] = sc.nextInt();
        System.out.print("성적 입력 2 : ");
        score[1] = sc.nextInt();
        System.out.print("성적 입력 3 : ");
        score[2] = sc.nextInt();
        System.out.print("성적 입력 4 : ");
        score[3] = sc.nextInt();
        System.out.print("성적 입력 5 : ");
        score[4] = sc.nextInt();

        for (int i = 0; i < score.length; i++) {
            if (score[i] < 40) score[i] = 40;
            sum += score[i];
            }
            System.out.print(sum / 5);
        */




    }
}
