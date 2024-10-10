package JAVA_241010_04_Comparator;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {

        // 제 3자
        // Fruit 안에 정렬 조건이 없었는데 생성자를 통해 넣어줌(FruitCompare)
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitCompare());
        treeSet.add(new Fruit("Grape", 3000));
        treeSet.add(new Fruit("Watermelon", 10000));
        treeSet.add(new Fruit("Strawberry", 12000));

        System.out.println("=== Fruits List ===");
        for (Fruit e : treeSet) System.out.println(e);

        // 정렬 조건 활용해보기
        // FruitCompare에서 만든 조건의 reversed(역순)
        TreeSet<Fruit> treeSet1 = new TreeSet<>(new FruitCompare().reversed());
        treeSet1.add(new Fruit("Grape", 3000));
        treeSet1.add(new Fruit("Watermelon", 10000));
        treeSet1.add(new Fruit("Strawberry", 12000));

        System.out.println("=== Fruits List ===");
        for (Fruit e : treeSet1) System.out.println(e);

    }
}
