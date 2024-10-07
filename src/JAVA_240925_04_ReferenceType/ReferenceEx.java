package JAVA_240925_04_ReferenceType;
// 참조타입 : 할당된 변수에 실제 값이 저장되는 것이 아니라 주소가 저장됨
// 참조하는 대상이 없는 경우 : NullPointerException 발생

public class ReferenceEx {
    public static void main(String[] args) {


        String name = "";
        String name2 = null;
        int age = 0; // null값을 사용할 수 없음, 참조 타입이 아니기 때문에 주소가 없음
        Integer age2 = 0; // Auto unboxing 기능으로 직접 값을 대입 가능

        int[] arr = null; // 참조 타입은 초기값을 nullㄹ로 지정 (힙 영역의 객체를 참조하지 않겠다는 뜻)

        Integer boxVal = null;
        int intVal = boxVal; // 참조 타입의 값을 대입, null이기 때문에 대상이 없음, 대상 없는 값을 대입하여 NullPointerException 발생
        System.out.println(intVal);
    }
}
