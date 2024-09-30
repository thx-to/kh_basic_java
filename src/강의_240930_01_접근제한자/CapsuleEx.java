package 강의_240930_01_접근제한자;
// 접근제한자 : 클래스와 인터페이스에 대해 다른 패키지나 클래스에서의 접근을 제한하는 용도
// protected는 같은 패키지거나 상속 관계가 존재하면 접근 가능
// 접근 제한자가 없으면 default, 같은 패키지 내에서만 접근 가능

public class CapsuleEx {
    public static void main(String[] args) {

        Child child = new Child("개발자");

        // 직업만 새로 갖고 나머지는 오버라이딩 없이 부모 그대로 물려받음
        System.out.println(child.getJob());
        System.out.println(child.getMoney()); // 부모로부터 상속받은 돈
        System.out.println(child.getName()); // 부모님이 물려준 이름
        System.out.println(child.getAddr()); // 부모님이 물려준 주소

    }
}


// 자식 만들기
class Child extends Parent {

    String job;

    // generator를 활용해 생성자 만들기
    public Child(String job) {
        this.job = job;
    }


    // generator를 활용해 Getter 만들기
    public String getJob() {
        return job;
    }


    // generator를 활용해 Setter 만들기
    public void setJob(String job) {
        this.job = job;
    }


    public String getMoney() {
        return money;

    }


    public String getName() {
        return name;
    }


    public String getAddr() {
        return addr;
    }




}