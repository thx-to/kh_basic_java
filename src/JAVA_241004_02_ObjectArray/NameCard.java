package JAVA_241004_02_ObjectArray;

public class NameCard {

    private String name;
    private int age;
    private String phone;
    private String email;

    // getter는 한번에 찍어주기
    public void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("전화번호 : " + phone);
        System.out.println("이메일 : " + email);
    }

    // generator를 활용하여 setter 자동생성
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
