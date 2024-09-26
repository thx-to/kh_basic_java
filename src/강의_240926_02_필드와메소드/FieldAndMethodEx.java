package 강의_240926_02_필드와메소드;
// 필드 : 변수의 속성을 표현하는 필드
// 메소드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
// 자바는 클래스 기반의 언어이므로, 클래스 외부에 별도의 함수가 존재할 수 없음 (파이썬, C++은 가능)
// 모든 것을 클래스 안에 있는 메소드로 구현해 줘야 함 ex) System.out.print()
// 그래서 문법이 길어지는 듯

public class FieldAndMethodEx {
    public static void main(String[] args) {

        // 동작 구현을 위해 FieldAndMethodEx를 객체로 만듦 (클래스 속성을 구현)
        FieldAndMethodEx test = new FieldAndMethodEx();

        int sum = test.sum(100, 200);
        System.out.print(sum);

        System.out.println(sum(100, 200));
        System.out.println(sum("Test", "Java"));
        System.out.println(sum("Test", 1234));

        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9));

    }


    // 클래스 메서드, 매개변수의 입력이 존재, 반환값도 존재
    static int sum (int a, int b){
        return a + b;

    }


    static String sum (String a, String b){ // 메소드 오버로딩 : 이름이 a, b로 같은데 매개변수 타입이 달라짐
        return a + b;

    }


    // 위 두개만 있으면 System.out.println(sum("Test", 1234)); 요 출력이 오류가 남
    // 메인을 변경하지 않고 오류를 없애려면 아래와 같이 메서드를 하나 더 넣어줌
    static String sum (String a,int b){
        return a + b;

    }


    // 매개변수의 개수를 알 수 없을 때 사용
    // 파이썬에서는 * 연산자를 넣어 튜플로 처리함
    // 전개연산자(Spread Operator, '...변수명') : 시퀀스형의 데이터를 펼쳐서 넣는다, 리액트에서 많이 쓰임
    static int sum (int ...val){
        int sum = 0;
        for (int e : val) {
            sum += e;
        }
        return sum;

    }


}