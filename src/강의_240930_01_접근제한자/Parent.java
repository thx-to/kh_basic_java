package 강의_240930_01_접근제한자;

public class Parent {

    // 접근 제한자가 없으면 default, 같은 패키지 내에서만 접근 가능
    String name;
    String money;
    String addr;

    public Parent() {

        name = "Steve Jobs";
        money = "thousand billion dollar";
        addr = "5th Ave NYC, US";

    }


    // generator를 활용해 Getter 만들기
    public String getName() {
        return name;
    }


    // generator를 활용해 Getter 만들기
    public String getMoney() {
        return money;
    }


    // generator를 활용해 Getter 만들기
    public String getAddr() {
        return addr;
    }


}

