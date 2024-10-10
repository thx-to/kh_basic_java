package JAVA_241010_10_단어정렬예제_내꺼;

import java.util.Scanner;
import java.util.TreeSet;

public class WordSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("단어의 갯수 N을 입력하세요 : ");
        int total = sc.nextInt();

        TreeSet<Word> treeSet = new TreeSet<>();
        for (int i = 0; i < total; i++) {
            System.out.print((i+1) + "번째 단어를 입력하세요: ");
            String words = sc.next();
            treeSet.add(new Word(words));
        }

        for (Word e : treeSet) {
            System.out.println(e.getWords());
        }

    }
}
