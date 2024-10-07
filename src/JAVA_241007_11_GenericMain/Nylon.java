package JAVA_241007_11_GenericMain;

public class Nylon extends Material{

    @Override
    public void doPrinting() {
        System.out.println("Nylon 재료로 출력합니다.");
    }

    public String toString() {
        return "재료는 Nylon입니다.";
    }
}
