package JAVA_241010_06_StackPractice;
// 괄호의 닫힘 여부를 스택으로 확인하는 방법

import java.util.Scanner;
import java.util.Stack;

public class StackExMain {
    public static void main(String[] args) {

        // Character는 char의 객체 타입
        Stack<Character> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();

        for (int i = 0; i < exp.length(); i++) {

            // 입력받은 문자열에서 해당하는 문자열의 문자를 반환
            char ch = exp.charAt(i);

            // 추출된 문자가 열림 소괄호이면
            if (ch == '(') {

                // Stack에 해당 문자를 저장
                st.push(ch);

                // 닫힘 소괄호이면
            } else if (ch == ')') {

                // Stack이 비어 있지 않다면, 맨 위의 값을 추출하면서 보여줌
                if (!st.empty()) st.pop();

                // Stack이 비어 있다면, 문구 출력
                // 이미 비어 있는데 닫힘 괄호가 오는 경우
                // 열림 괄호가 부족한 경우
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("괄호가 일치합니다.");
            // 닫힘 괄호가 부족한 경우
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }

    }
}
