package 강의_240925_07_배열정렬;
// 정렬 알고리즘 구현해보기 : 버블정렬(O(n^2)), 삽입정렬(O(n^2), 병합정렬(O(nlogn)), 퀵정렬(O(nlogn))
// 순회구조 이해하기


public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) { // i는 인덱스 0부터 배열 길이만큼 1씩 증가하며 반복 / i는 j가 한바퀴 다 돌때까지 돌아가지 않음
            for (int j = i; j < arr.length; j++) { // 처음 i=9, j=9부터 시작
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                } // i와 j가 이중 for문을 다 돌면서 정렬, 이중 for문을 도는만큼의(제곱) 시간이 소요
            }

            for (int e : arr) System.out.print(e + " ");


        }
    }
}
