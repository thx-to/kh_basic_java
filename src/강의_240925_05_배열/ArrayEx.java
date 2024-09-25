package 강의_240925_05_배열;
// 자바의 배열은 동일한 데이터 요소가 연속적으로 저장되는 자료 구조
// int[] arr = new int[4]; 형식, 길이가 4인 int 배열의 선언 및 생성 / arr은 int 배열에 대한 참조변수 / new는 힙영역에 메모리 확보받음, int크기(하나에 4Byte)의 4개(총 16Byte)만큼
// 자바의 배열은 힙영역에 메모리가 할당되고, 크기를 지정해야 함
// 배열의 개선된 형태는 List(Array List, Vector, Linked List)가 있음
// 배열이나 리스트의 형태는 시퀀스형의 자료구조이므로 인덱스로 값에 접근해야 함

// 범위 기반 for문은 배열의 내용을 변경할 수 있음, 범위를 지정해서 순회 가능
// 향상된 for문은 배열의 내용을 변경할 수 없음, 무조건 전체 순회

// 최근에는 향상된 for문을 더 선호하는 편, 출력시에는 내용이 바뀌지 않는게 더 유리함 (원본 데이터 보장)

public class ArrayEx {
    public static void main(String[] args) {


        int[] score = new int[3]; // 길이가 3인 int 배열 생성

        score[0] = 78;
        score[1] = 80;
        score[2] = 90;

        /*
        // 범위 기반 for문
        for(int i = 0; i < score.length; i++) { // 인덱스니까 길이보다 작은게 범위
            score[0] = score[i] + 10; // 배열 내용 변경 가능
            System.out.print(score[i] + " ");
        }
        */

        /*
        // 향상된 for문
        for(int e : score) {
            e = e + 10; // 이렇게 써도 배열 내용 변경 안됨
            System.out.print(e + " ");
        }
        */





        // 배열을 선언하는 여러가지 방법
        // 요 두가지가 제일 많이 쓰임

        int[] score1 = new int[4]; // 힙 영역에 메모리 공간을 확보
        int[] score2 = {88, 99, 43}; // 컴파일러가 크기를 알 수 있으므로 크기 지정이 필요 없음

        int[] score3;
        score3 = new int[3];
        int[] score4;
        score4 = new int[]{34, 55, 66};




    }
}
