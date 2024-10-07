package JAVA_241007_05_WrapperClass;
// Wrapper 클래스 : 기본 타입의 데이터를 객체 타입으로 취급하도록 변환해주는 클래스

public class WrapClassEx {
    public static void main(String[] args) {

        // integerEx라는 참조 타입 만들기
        // Heap 영역의 메모리에 접근, 객체 내부의 인스턴스 필드에 접근
        // integerEx 안에는 주소가 들어가 있음, 참조 타입으로 변환됨
        IntegerEx integerEx = new IntegerEx();
        integerEx.x = 100;
        System.out.println(integerEx.x);

        // Boxing : 기본 타입을 참조 타입 내에 넣는 것
        Integer y = 100; // Auto Boxing
        int yy = y;


    }
}


class IntegerEx {

    // 기본 int 타입은 기본타입 (참조타입 X)
    int x;
}