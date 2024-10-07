package JAVA_240925_03_IterationPractice;
// 예제 1)
// 1 ~ 1000 사이의 7의 배수를 구하고, 한 줄에 10개씩 출력
// 이중 for문 아님
// for (초기값;최종값;증감값) {} 으로 풀기

// 예제 2)
// 구구단 출력
// 단수 입력 :

// 예제 3)
// 별찍기
// ★★★★★
// ★★★★
// ★★★
// ★★
// ★

public class IteratorEx2 {
    public static void main(String[] args) {



        /*
        // 예제 1 해설, 현실적이라고 하심
        int cnt = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i % 7 == 0) {
                System.out.printf("%5d", i);
                cnt++;
                if (cnt == 10) { // 매 줄마다 10개씩 카운트하고
                    System.out.println();
                    cnt = 0; // 끝나면 0으로 리셋함
                }
            }
        }
        */


        /*
        // 예제 1 해설, ideal하다고 하심
        for (int i = 1; i <= 1000; i++) {
            // i가 7의 배수면
            if (i % 7 == 0) System.out.printf("%5d", i); // i가 7의 배수면 5칸의 공간을 잡고 decimal 형식으로 오른쪽 정렬한 i 출력
            if (i % 70 == 0) System.out.println(); // i가 70의 배수면 줄바꿈
        }
        */


            /*
            // 인터넷에서 본거

                int cnt = 0;			// 10개씩 출력후 줄바꿈을 위한 변수선언
                for(int i = 1; i <= 1000; i++){ // i는 1부터 1000 이하까지 1씩 더하면서 반복
                    if(i % 7 == 0){		// i가 7의 배수면
                        if(cnt % 10 == 0){	// cnt가 10의 배수면
                            System.out.println(); // 줄바꿈
                        }
                        System.out.printf("%5d", i); // 5칸의 공간을 잡고 오른쪽 정렬해서 i를 decimal로 출력
                        cnt++;		// 10개씩 출력해주는 cnt를 0부터 1개씩 증가시킴
                    }
                }
                */



        /*
        // 예제 2 해설
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 스캐너 생성
        System.out.print("단수 입력 : ");
        int n = sc.nextInt(); // n이라는 정수 입력받기
        System.out.println("=== " + n + "단 ==="); // 첫줄 출력 서식, n단임을 안내
        for (int i = 1; i <= 9; i++) { // i는 1부터 9까지 1씩 증가하며 반복
            System.out.println(n + " X " + i + " = " + (n * i)); // 출력 형식은 n x i = n*i
        }
        */


        /*
        // 예제 3 풀어보기
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) { // i가 0부터 num까지 1씩 더해가면서 돌아
            for (int j = 0; j < num - i; j++) { // 값을 1씩 빼줌, 첫번째줄은 n, 두번째줄은 n-1 이런식
                System.out.printf("★"); // j가 별을 찍으면서 돌아.. n이 5라고 가정, i=1/j=4
            }
            System.out.println();
        }
        // 얘는 기본별
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        */


    }
}