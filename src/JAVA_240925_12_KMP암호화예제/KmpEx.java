package JAVA_240925_12_KMP암호화예제;
// 입력예제1) Knuth-Morris-Pratt / 출력예제1) KMP
// 입력예제2) Korea-Seoul / 출력예제2) KS
// 입력예제3) Mirko-Slavko / 출력예제3) MS

// 방법1) 대문자만 골라서 찍기 (ASCII코드 확인)
// 방법2) 0번째 문자 출력, "-" 다음 문자 출력
// 방법3) "-" 기준으로 자르고(split) 문자열 배열 생성 후 각 배열의 0번째 문자 출력
// 방법4) toCharArray()를 사용해서 문자 배열로 만든 후 대문자만 골라내기
// 등 여러가지 방법이 있음

import java.util.Scanner;

public class KmpEx {
    public static void main(String[] args) {

        //공통 영역
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String words = sc.next();


        /*
        // 방법1) 대문자만 골라서 찍기 (ASCII코드 확인)
        // char에서 '-' 삭제가 안됨, 피드백 필요
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch < 'a') {
                if (ch == '-') ch=null; // 없애는거 어떻게하지? 아니면 건너뛰기?
                    System.out.print((char) (ch));
            }
        }
        */

        /*
        // 방법1) 수정
        // ASCII코드를 대문자 범위로만 설정해두면 '-'를 없앨 필요가 없음
        // 소문자보다 작은걸로 하면 소문자와 대문자 사이의 특수문자, 소문자보다 작은 특수문자들까지 모두 포함됨, 문제 옵션을 벗어남
        // 정상 출력 확인
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char) (ch));
            }
        }
        */

        /*
        // 방법2) 0번째 문자 출력, "-" 다음 문자 출력
        // 정상 출력 확인!
        // 처음에는 substring(첫인덱스,마지막인덱스)로 했는데, 사실 그럴 필요 없이 charAt(해당인덱스)로하면됨
        // for문으로 첫인덱스부터 끝인덱스까지 돌리고 '-'가 있으면 다음문자 출력
        System.out.print(words.charAt(0));
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch == '-') System.out.print(words.charAt(i+1));
        }
        */

        /*
        // 방법2) 강사님 버전
        // for문을 먼저 돌리고, if문으로 i가 0일때 일단 출력 else문으로 i에 해당하는 문자가 '-'일 때, i+1 출력
        for(int i = 0; i < words.length(); i++) {
            if(i == 0) System.out.print(words.charAt(i));
            else {
                if(words.charAt(i) == '-') System.out.print(words.charAt(i+1));
            }
        }
         */


        /*
        // 방법3) "-" 기준으로 자르고(split) 문자열 배열 생성 후 각 배열의 0번째 문자 출력

        // for문
        String[] wordsStr = words.split("-");
        for (int i = 0; i < wordsStr.length; i++) {
            System.out.print(wordsStr[i].charAt(0));
        }

        System.out.println(); // 그냥 개행

        // 향상된 for문
        for (String e : wordsStr) {
            System.out.print(e.charAt(0));
        }
        */


        /*
        // 방법4) toCharArray()를 사용해서 문자 배열로 만든 후 대문자만 골라내기

        char[] wordsStr = words.toCharArray(); // 배열로 만들어줌

        // for문
        for (int i = 0; i < wordsStr.length; i++) {
            if (wordsStr[i] >= 'A' && wordsStr[i] <='Z') System.out.print(wordsStr[i]);
        }

        System.out.println(); // 그냥 개행

        // 향상된 for문
        for (char e : wordsStr) {
            if (e >= 'A' && e <='Z') System.out.print(e);
        }
        */





    }
}
