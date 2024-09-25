package 강의_240925_06_커맨드라인입력;

import static java.lang.System.exit;

public class CommandInput {
    public static void main(String[] args) {



        if(args.length != 2) { // 길이가 2가 아니면
            System.out.println("인자값이 2개가 필요합니다.");
            exit(0);
             // 프로그램 강제종료
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer. parseInt(args[1]);
        System.out.println("결과 : " + (num1 + num2));




    }
}
