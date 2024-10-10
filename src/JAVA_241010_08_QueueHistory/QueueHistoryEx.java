package JAVA_241010_08_QueueHistory;
// 명령어 이력 조회하기

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueHistoryEx {

    Queue<String> queue = new LinkedList<>();

    // Queue의 크기를 정해줌
    final static int MAX_SIZE = 10;

    public static void main(String[] args) {

        // Queue history 만들기
        // 현재 클래스를 객체로 만들기
        // 1개니까 인스턴스 필드로 만들어도 되고 클래스로 만들어도 됨
        QueueHistoryEx history = new QueueHistoryEx();

        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {

            // Git Bash의 화면처럼 만들어주기 (입력창의 $심볼)
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);

            // trim() : 입력받은 문자열의 앞뒤 공백 제거
            String cmd = sc.nextLine().trim();

            // equalsIgnoreCase() : 대소문자 구분하지 않음
            // q(Q)라고 입력하면
            if (cmd.equalsIgnoreCase("q")) {

                // 프로그램 강제종료
                // 보통 컴파일언어는 메인에서 시작해서 메인에서 종료
                // exit문은 여기서 바로 끝남
                // 종료됐던 사유를 운영체제에게 알려줌(status값에 어떤 값을 넣어도 됨, 의미 없는 숫자)
                System.exit(0);

            // help(HELP)라고 입력하면
            } else if (cmd.equalsIgnoreCase("help")) {

                // 문구 출력
                System.out.println("help - 도움말을 보여줍니다.");
                System.out.println("q/Q - 프로그램을 강제종료합니다.");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");

            // history(HISTORY)라고 입력하면
            } else if (cmd.equalsIgnoreCase("history")) {

                // 10개가 넘으면 앞에꺼 지우고
                history.save(cmd);
                int cnt = 0;

                // history에 있는 queue(시퀀스형 데이터, 해당하는 요소를 빼옴)를 반복수행
                for (String e : history.queue) {
                    // Git Bash의 화면처럼 만들어주기 (히스토리 카운트)
                    cnt++;
                    System.out.println(cnt + " " + e);
                }

            // 일반 명령어인 경우
            } else {

                history.save(cmd);
                System.out.println(cmd);

            }
        }

    }

    // main 메소드 밖에서 save라는 메소드를 하나 만들기
    void save(String cmd) {

        // cmd가 들어오면 Queue에 offer
        queue.offer(cmd);

        // Queue의 사이즈가 MAX_SIZE인 10개보다 크면 remove(해당 Queue에 있는 맨 앞의 요소부터 제거)
        if (queue.size() > MAX_SIZE) queue.remove();

    }

}
