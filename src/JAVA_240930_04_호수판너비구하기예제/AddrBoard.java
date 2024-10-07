package JAVA_240930_04_호수판너비구하기예제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddrBoard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /*
        // 해보려고 한거

        while (true) {
            System.out.print("호수 입력 : ");
            String n = sc.next();

            // 마지막 공백을 미리 넣어줌
            int sum = 1; //

            if (n.length() == 1 && n.charAt(1) == '0') break;
            else {
                for (int i = 0; i < n.length(); i++) {
                    if (n.charAt(i) == '0') {
                        sum += 5;

                    } else if (n.charAt(i) == '1') {
                        sum += 3;

                    } else {
                        sum += 4;

                    }
                }
            }
            System.out.println(sum);
        }


        */


        /*
        // 강사님 풀이 (배열)

        int[] number = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3, }; // 0은 4칸, 1은 2칸, 나머지는 3칸으로 배열 만든 것
        int sum = 0; // 총 자리수를 누적하기 위한 변수
        int[] rst = new int[100]; // 결과를 한번에 출력해야 하기 때문에 최대 100개의 결과 저장 배열 생성
        int index = 0; // 배열은 인덱스 계산이 필요하기 때문에 인덱스 변수 생성

        while(true) {
            String num = sc.nextLine(); // num이 외부에 있는게 유리하지만 코드의 복잡성때문에 안에 넣음
            if (num.equals("0")) break;
            for (int i = 0; i < num.length(); i++) {

                // 120 입력시 length는 3, 0이 ASCII코드값 48이므로 1 넣으면 49
                // number[num.charAt(i) - '0'] + 1 = number[49-48]+1
                // 이런식으로 아스키코드의 기준값(예시상으로는 0)을 잡아 그 차이의 숫자를 이용해줌 > 그 차이가 String의 해당 Number
                sum += number[num.charAt(i) - '0'] + 1;
            }

            // 1은 숫자 마지막의 공백 한 칸
            rst[index++] = sum + 1;
            sum = 0;
        }

        // 결과 출력
        for (int i = 0; i < index; i++) {
            System.out.println(rst[i]);
        }

        */

        /**/
        // 강사님 풀이 (ArrayList)
        int[] number = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0;
        List<Integer> rst = new ArrayList<>();
        while (true) {
            String num = sc.nextLine();
            if (num.equals("0")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += number[num.charAt(i) - '0'] + 1;
            }
            rst.add(sum + 1); // 리스트의 마지막 인덱스에 값이 추가됨
            sum = 0;
        }
        for (int e : rst) System.out.println(e);

        /**/
    }
}
