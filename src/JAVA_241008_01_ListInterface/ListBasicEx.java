package JAVA_241008_01_ListInterface;
// List 인터페이스 : ArrayList, Vector, LinkedList의 부모 인터페이스 (상속을 주기 위한)
// 배열과 비슷한 형태의 자료 구조 (인덱스 기반, 인덱스를 갖고 값을 찾아냄)
// 파이썬의 자료구조는 두가지, 리스트와(튜플도 리스트) 딕셔너리 / 튜플은 이뮤터블, 리스트는 뮤터블
// 리스트는 동적으로 크기가 변함 (동적 할당, 데이터 크기가 고정되어 있지 않음, 넣을때마다 리사이징하는건 아니고 처음에 임의로 크게 잡아둠)
// 요소의 저장 순서가 유지됨 (배열처럼 연속된 공간에 들어가니까)
// 맵 계열은 키로 값을 넣기 때문에 순서 유지가 안됨
// 같은 요소의 중복 저장을 허용 (집합은 중복 저장이 안됨)
// 데이터를 다루기 위한 다양한 메소드 제공
// 리스트 인터페이스의 구현체인 ArrayList, Vector, LinkedList의 사용 방법이 동일함 (인터페이스를 상속받았기 때문에)
// 리스트로 어레이리스트를 바라보는 방법과 어레이리스트의 참조변수로 리스트를 바라보는 방법은 미묘한 차이가 있음
// 리스트 인터페이스는 모두 제네릭으로 만들어져 있음 (기본 타입의 데이터를 객체로 취급해야 함)
// 참조 타입은 모두 8바이트 (주소가 8바이트)
// 검색에는 ArrayList가 유리, 삽입/삭제가 잦은 경우에는 LinkedList가 유리

import java.util.*;

public class ListBasicEx {
    public static void main(String[] args) {

        // 일반 : List list = new ArrayList(); (컬렉션 프레임워크 문법을 활용하지만 제네릭 문법을 활용하지는 않음, 나중에 형변환이 필요함)
        // 제네릭 문법 활용 : List<String> list = new ArrayList<>(); (제네릭 문법 활용)
        // List 인터페이스의 참조변수로 ArrayList로 생성된 객체를 참조함
        List<String> fruits = new LinkedList<>();

        // 요소 추가
        // add() : 리스트 맨 뒤에 요소를 추가하는 메소드
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 리스트 출력
        // ArrayList자체가 toString()을 자동으로 오버라이딩됨
        System.out.println("과일 목록 : " + fruits); // System.out 출력에 toString()이 자동으로 붙음
        System.out.println("과일 목록 : " + fruits.toString()); // toString()을 붙여도 되고 안붙여도 됨

        // 특정 인덱스에 요소 추가
        fruits.add(1, "Grape");
        System.out.println("새로운 과일 목록 : " + fruits);

        // 요소 가져오기 (인덱스 접근)
        System.out.println("과일 요소 : " + fruits.get(2));

        // 요소 제거하기
        fruits.remove(2);
        System.out.println("수정된 과일 목록 : " + fruits);

        // 리스트의 사이즈 확인
        System.out.println("과일 목록의 사이즈 : " + fruits.size());

        // 요소 순회하기 (향상된 for문)
        // 요소의 데이터형을 알아야 함
        for (String e : fruits) {
            System.out.println(e + " ");
        }

        // 배열 만들어서 직접 넣어주기도 가능
        // Arrays.asList() 배열을 리스트로 변환하는 메소드
        String[] fruitsArr = {"Watermelon", "Peach", "Cherry"};
        List<String> fruits1 = new ArrayList<>(Arrays.asList(fruitsArr));
        fruits1.add("Kiwi");
        fruits1.add("Pear");
        fruits1.add("Fig");
        System.out.println("추가된 과일 목록 1 : " + fruits1);

        // 리스트 정렬하기
        // Comparator 기본 메소드 오름차순, 그냥 정렬은 사전순 compareTo() 적용
        fruits1.sort(Comparator.naturalOrder());
        System.out.println("오름차순 정렬된 과일 목록 1 : " + fruits1);
        // Comparator 기본 메소드 내림차순
        fruits1.sort(Comparator.reverseOrder());
        System.out.println("내림차순 정렬된 과일 목록 1 : " + fruits1);
        // Comparator(2개의 비교대상 비교)
        // 정렬은 sort 메소드가 해주고, compare 이후에 매개변수로 정렬 조건만 넣어줌
        fruits1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1의 길이가 o2의 길이보다 길면 1을 반환
                // sort에 1이 반환되면 두 개의 순서를 뒤집음
                // watermelon과 peach 순서로 들어왔을 경우, watermelon이 peach보다 길이가 기니까 1이 반환되어 둘의 순서가 바뀌고 peach, watermelon의 순서로 정렬됨
                if (o1.length() > o2.length()) return 1;
                else {
                    // o1의 길이와 o2의 길이가 같으면
                    if (o1.length() == o2.length()) {
                        // 앞의 유니코드값이 크면 양수 반환, 뒤의 유니코드값이 크면 음수 반환
                        // 사전순 정렬
                        // 유니코드값이 크면 알파벳이 뒤쪽에 있음, 사전에도 뒤쪽이니 sort에 양수를 반환해 순서를 뒤집어줌
                        return o1.compareTo(o2);
                    }
                    // 아니면 현상태 유지
                    return -1;
                }
            }
        });
        System.out.println("sort로 정렬된 과일 목록 1 : " + fruits1);


        // int(기본 타입)가 아니고 Integer로 wrapping해서 넣어줌
        // 실제 값이 들어가면 안되고 주소를 넣어줘야 하기 때문
        // ArrayList는 내부 구조가 제네릭(데이터타입 일반화)으로 만들어져 있기 때문에 기본 타입이 들어가면 안됨
        // 정수 값이 들어가면 안되고 정수값이 가진 주소가 들어가야 함
        // 이재용 집이랑 우리 집이랑 규모?는 달라도 똑같은 도로명주소 체계를 가지는 거라고 생각해..
        List<Integer> number = new LinkedList<>();
        number.add(200);

    }
}
