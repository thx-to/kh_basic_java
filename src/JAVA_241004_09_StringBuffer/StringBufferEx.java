package JAVA_241004_09_StringBuffer;
// 기본적으로 문자열 처리는 String 클래스 사용하는 것이 일반적
// String 클래스로 문자열을 처리하는 경우 매번 새로운 문자열이 만들어짐
// StringBuffer, StringBuilder는 객체를 생성해 할당된 메모리에 계속 추가해 나가는 방식
// StringBuffer, StringBuilder는 사용 방법이 완전히 동일함
// StringBuffer는 멀티 스레드 환경을 지원하고 StringBuilder는 지원하지 않음
// 멀티스레드를 하는 동시에 동기화 문제가 발생하며 속도가 떨어지기 때문에 일반적으로는 StringBuilder를 사용(멀티스레드를 지원하지 않는 것)하는 것을 기본으로 함
// 배열에서 멀티스레드를 지원하지 않는 ArrayList를 기본으로 하는 것과 같은 맥락
public class StringBufferEx {
    public static void main(String[] args) {

        // String 자료형 사용 예시
        // ""은 값이 없다(값이 빈 문자)는 뜻, null은 참조하고 있는 객체가 없다는 것
        // 원래 문법대로라면 String은 참조 타입이기 때문에 new가 있어야 함
        // String rst = new String();의 방식으로
        // 자바에서 편의상 Auto boxing, Auto unboxing 지원
        // 참조타입임에도 불구하고 직접 값을 바라볼 수 있게끔 지원
        // Integer도 참조타입
        // 우리는 이렇게 쓰지만 Integer age = 0;
        // 원래대로라면 Integer age = new Integer(0);의 방식
        // String 자료형은 아래와 같은 방식으로 추가할때마다 매번 새로운 문자열이 만들어지는 방식
        String rst = "";

        rst += "안녕하세요?";
        rst += " ";
        rst += "자바를";
        rst += " ";
        rst += "공부합니다.";

        System.out.println(rst);

        // StringBuffer 자료형 및 append 사용 예시
        // 문자열이 길어지거나 수정이 많은 경우 StringBuffer가 String보다 유리함
        // StringBuffer 자료형은 할당받은 주소에 값을 계속 누적하는 방식
        StringBuffer sb = new StringBuffer();
        sb.append("안녕하세요?");
        sb.append(" ");
        sb.append("자바를");
        sb.append(" ");
        sb.append("공부합니다.");

        System.out.println(sb);

        // StringBuilder 자료형 및 append 사용 예시
        StringBuilder sbd = new StringBuilder();
        sbd.append("안녕하세요?");
        sbd.append(" ");
        sbd.append("자바를");
        sbd.append(" ");
        sbd.append("공부합니다.");

        System.out.println(sbd);

        // insert 사용 예시
        sb.insert(0, "Hi~~~ ");
        System.out.println(sb);

        // delete 사용 예시
        sb.delete(2,5);
        System.out.println(sb);

        // substring 사용 예시
        System.out.println(sb.substring(0, 2));

    }
}
