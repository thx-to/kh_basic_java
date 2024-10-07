package JAVA_241007_07_Arrays_과일이름예제;
// 임의의 10개의 과일이름 입력 후 길이순으로 정렬하고, 길이가 같은 경우 사전 순으로 정렬

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExMain {
    public static void main(String[] args) {

        // ASCII 코드값으로 정렬하기 때문에 대/소문자 구분
        String[] fruits = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
        "Mango", "Watermelon", "Cherry", "Plum", "Peach"
        };

        Arrays.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1이 o2보다 길면
                // 리턴값은 sort한테 감
                if (o1.length() > o2.length()) return 1;

                else  {

                    // o1과 o2 길이가 같으면
                    if (o1.length() == o2.length()) {

                        // compareTo() : 앞이 길면 양수 반환, 뒤가 길면 음수 반환
                        return o1.compareTo(o2);
                    }

                    // 아니면 현 상태 유지
                    return -1;
                }
            }
        });
        System.out.println(Arrays.toString(fruits));
    }
}
