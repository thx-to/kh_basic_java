package JAVA_241010_10_단어정렬예제_강사님코드;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSortEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        // 익명의 객체나 익명의 클래스 생성시 더 간단한 문법이 있다고 .. 회색으로 표시됨
        // (new Comparator<String>() 부분이 회색으로 표시, 인텔리제이는 람다로 바꾸라고 권장
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        for(int i = 0; i < n; i++) {
            set.add(sc.nextLine().trim());
        }
        sc.close();

        for (String e : set) System.out.println(e);

    }
}
