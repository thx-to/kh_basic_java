package JAVA_241004_08_CloneMethod;
// Cloneable 인터페이스는 복제 허용에 대한 implements (일반 클래스는 복제가 안됨)

// 그동안의 implements는 키워드 입력시 빨간줄(오류)이 떴는데 Cloneable은 안뜸
// 구현해야 할 메소드가 없기 때문
// 해당 클래스가 Cloneable을 구현할지 말지를 상속받아서 결정해야 함

public class Member implements Cloneable {

    String id;
    String name;
    String password;
    int age;
    boolean isAdult;


    // generator로 생성자 만들기
    public Member(String id, String name, String password, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.isAdult = isAdult;
    }


    // 메소드 구현 시 반환 타입이 Member
    // 나중에 getMember라는 멤버를 부르면 객체가 반환됨
        public Member getMember() {

            Member cloned = null;
            try {

                // 클론 메소드는 Object 타입이므로 형 변환이 필요함
                // 복제시 Member 타입으로 변환해줌
                cloned = (Member) clone();

            // CloneNotSupportedException : 클론이 아닌 경우에(클론 복제를 허용하지 않는 경우)는 예외처리가 뜸
            } catch (CloneNotSupportedException e) {

                // printStackTrace : 코드가 죽을 때 결과에 스택(콜스택-함수와 메소드가 불려지는 경로와 과정)을 다 찍어서 보여줌
                e.printStackTrace();

            }

            // getMember에 얕은 복사가 이루어질 때 복제
            return cloned;
        }


}
