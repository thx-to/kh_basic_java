package JAVA_241010_04_Comparator;
// Comparator는 클래스가 하나 더 필요함
// 정렬 조건을 만들어주는 클래스
// Comparator implements시 generate에 비교 조건을 만들어주는 수많은 오버라이드 메소드가 뜸

import java.util.Comparator;

public class FruitCompare implements Comparator<Fruit> {
    @Override
    // 두 개의 객체(object 1, object 2)를 받아서 비교해줌
    public int compare(Fruit o1, Fruit o2) {

        // 뒤가 크면 뒤집어서 정렬 (내림차순)
        if (o1.getPrice() < o2.getPrice()) return 1;
        // 같으면 이름을 비교해서 사전순으로 정렬
        else if (o1.getPrice() == o2.getPrice()) return o1.getName().compareTo(o2.getName());
        // 아니면(앞이 크면) 뒤집지 않고 그대로
        else return -1;

    }

}
