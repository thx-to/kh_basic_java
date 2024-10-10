package JAVA_241010_02_Comparable;
// Comparable과 Comparator는 자바에서 객체를 정렬하는데 사용하는 인터페이스
// Comparable : 나와 다른 객체를 비교 (1인칭)
// Comparator : 두 개의 다른 객체를 비교 (3인칭)

import java.util.TreeSet;

public class CompareEx {
    public static void main(String[] args) {

        TreeSet<Car> treeSet = new TreeSet<>();

        // treeSet에 add를 하는데 객체를 넣음, 바로 저장됨
        treeSet.add(new Car("Santefe", 2023, "White"));
        treeSet.add(new Car("Sorento", 2005, "Silver"));
        treeSet.add(new Car("Grandeur", 2018, "Black"));
        treeSet.add(new Car("Casper", 2023, "Khaiki"));
        treeSet.add(new Car("Casper", 2023, "Red"));

        for (Car e : treeSet) {
            System.out.println("이름 : " + e.getName() + ", " + e.getYear() + "년식, " + e.getColor());
        }

    }
}
