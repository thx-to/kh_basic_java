package JAVA_241014_09_StreamPractice;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {

        // 생성자를 통해 List 만들어 객체 넣기
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("PHAM HANNI", 21, 50000));
        customerList.add(new TravelCustomer("KIM MINJI", 21, 30000));
        customerList.add(new TravelCustomer("MO DANIELLE", 20, 8000));
        customerList.add(new TravelCustomer("KANG HAERIN", 19, 300));
        customerList.add(new TravelCustomer("LEE HYEIN", 17, 50));

        // 고객 명단을 순서대로 가져오기
        System.out.println("======= 고객 명단 출력 =======");

        // 기존에는 리스트 가져오려면 for문을 사용했지만 이제는 stream을 써보자
        customerList.stream().map(e -> e.getName()).forEach(e -> System.out.print(e + " / "));

        System.out.println(); // 단순개행
        System.out.println(); // 단순개행

        // 고객 여행 총 비용
        // sum()은 최종 연산
        System.out.println("======= 여행 전체 비용 =======");
        int total = customerList.stream().mapToInt(e -> e.getPrice()).sum();
        System.out.print(total + "원");

        System.out.println(); // 단순개행
        System.out.println(); // 단순개행

        // 20세 이상 명단 출력
        System.out.println("======= 20세 이상 고객 =======");
        customerList.stream()
                // 20세 이상을 필터링하고
                .filter(e -> e.getAge() >= 20)
                // 이름만 뽑아내서
                .map(e -> e.getName())
                // 정렬을 하고 (기본 내림차순)
                .sorted()
                // 찍어냄 (최종 연산)
                .forEach(e -> System.out.print(e + " / "));

    }
}

class TravelCustomer {

    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    // 값은 생성자에서 세팅되고 변경이 일어나지 않을 것이기 때문에 getter만 생성
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getPrice() {
        return price;
    }
}
