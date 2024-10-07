package JAVA_241007_08_SystemClass;
// System 클래스 : 표준 입/출력 관련, 시스템 정보 관련 메소드 제공

import static java.lang.Thread.sleep;

public class SystemClassEx {
    public static void main(String[] args) throws InterruptedException {

        // 1000개짜리 배열을 만듦
        int[] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 1000) + 1; // 1~1000 사이의 임의의 값

        for (i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }

        // currentTimeMillis() : UTC 1970년 1월 1일 0시 0분부터 경과 시간을 밀리초 단위로 반환
        long start = System.currentTimeMillis();

        // sleep 쓸 때 sleep import 및 InterrruptedException throws 해주기
        for (i = 0; i < data.length; i++) {
            cnt++;
            sleep(1);
            if (randVal == data[i]) {
                System.out.println("위치 : " + (i + 1));
                break;
            }
        }

        // 특정 구간에서 얼마만큼의 시간을 쓰고 있는지, 경과시간을 측정할 때 사용
        long end = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (end - start) + "밀리초 입니다.");

    }
}
