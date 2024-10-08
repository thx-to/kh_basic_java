package JAVA_241008_04_HashMapBasic;
// Map 인터페이스 : 키(key)와 값(value)의 쌍(pair)으로 자료를 관리하는 인터페이스(메소드)
// Map 인터페이스로 만들어져 있는 구현체 : HashMap, TreeMap, HashTable, Properties

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {

        // Map 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 추가 : Entry(키, 값)
        // 자바의 Entry = 파이썬의 Item
        map.put("PHAM", 98);
        map.put("KIM", 70);
        map.put("MOD", 85);
        map.put("HAERRRRRIN", 90);
        map.put("HYEIN", 92);

        // 키가 같기 때문에 나중에 저장된 값으로 대체됨
        // HashSet으로 하면 안들어감 (집합은 중복 입력 자체가 안됨)
        map.put("PHAM", 100);
        System.out.println("총 Entry 수 : " + map.size()); // 5

        // 키로 값 찾기
        System.out.println("Key로 값 찾기 : " + map.get("PHAM"));

        // 반복 순회 방법 1) 향상된 for문 이용, 권장 방식
        // for (String e : map) { 이렇게 돌리면 안됨, 첫 인덱스부터 마지막 인덱스까지? Map은 순회하는 기준이 Key가 돼야 함
        System.out.println("= 향상된 for문으로 반복 순회 =");
        for (String key : map.keySet()) { // key값이 중복되면 안되니 뒤에 Set을 붙여 keySet()
            System.out.println(key + " : " + map.get(key));
        }

        // 반복 순회 방법 2) 반복자(Iterator)를 이용하는 방식, 이전 방식
        System.out.println("= Iterator로 반복 순회 =");
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
