package JAVA_241007_06_ArraysClass;
// Arrays 클래스 : 배열과 관련된 다양한 메소드를 제공하는 클래스

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysClassEx {
    public static void main(String[] args) {

        sortAndSearchFunc();
        sortComparatorFunc();

    }

    // 정렬과 검색
    static void sortAndSearchFunc() {

        // int 배열 생성
        int[] array = {5, 4, 7, 9, 13, 3, 1, 88, 23};

        // 오름차순으로 정렬
        // 검색을 하기 위해서는 특정 방식으로 정렬 필수
        Arrays.sort(array);

        // 시퀀스형 데이터이기 때문에 향상된 for문 돌리기 가능
        for (int e : array) System.out.print(e + " ");
        System.out.println();
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array, 88));
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array, 1));
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array, 5));

        // 내림차순으로 정렬
        // 기본 배열에 아래 내림차순 정렬시 no instance(s) of type variable(s) T exist so that int[] conforms to T[] 오류 출력
        // T[]는 제네릭 타입
        // 아래와 같이 Integer로 Wrap해줌
        Integer[] array1 = {5, 4, 7, 9, 13, 3, 1, 88, 23};
        Arrays.sort(array1, Collections.reverseOrder());
        for (int e : array1) System.out.print(e + " ");
        System.out.println(); // 단순줄바꿈
    }


    // 정렬 오버라이딩 : 상속받은 메소드를 재정의
    // 정렬 조건을 스스로 만들기 위해서 사용(기본 정렬은 오름차순/내림차순만 제공)
    // 정렬을 해야할지 말아야할지는 사용자가 결정, 정렬 자체는 자바가 함
    // Comparator 클래스의 정렬 조건을 만드는 compare 메소드를 오버라이딩하여 정렬 조건을 만듦
    // Comparator는 인터페이스(=설계 도면) 문법, 객체만 올 수 있음
    // ex) 과일 정렬 : 길이가 짧은 순으로 기본 정렬, 길이가 같은 경우 사전 순서대로 정렬
    static void sortComparatorFunc() {

        Integer[] array2 = {5, 4, 7, 9, 13, 3, 1, 88, 23};

        Arrays.sort(array2, new Comparator<Integer>() {
            // new만 써도 인텔리제이가 아래 오버라이드까지 자동 생성해줌 (인터페이스는 구현부가 필요)
            // 기본 생성식
            // public int compare(Integer o1, Integer o2) {
            // return 0;
            // Comparator를 넣고 익명의 객체를 만들어 주는 방식
            // compare 조건 만들기
            @Override

            // o1, o2는 array2의 5가 될수도, 4가 될수도 있음, 순서대로 대입
            // 오름차순
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1; // o1 < o2로 바꿔주면 내림차순
                return -1;
            }
        });
        // 여기 for문에는 int도 Integer도 가능
        for (int e : array2) System.out.print(e + " ");
        System.out.println(""); // 단순줄바꿈

        // 일반 배열을 ArrayList로 변환
        List <Integer> list = Arrays.asList(array2);
    }
}



