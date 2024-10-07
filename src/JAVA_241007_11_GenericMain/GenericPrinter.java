package JAVA_241007_11_GenericMain;

// <T extends Material> Material 클래스로부터 상속받은 타입만 올 수 있음
public class GenericPrinter<T extends Material> {

    // T 타입 변수로 재료의 형태가 결정
    // T 타입에 대한 참조변수
    private T material;

    // setter 만들어보기
    public void setMaterial(T material) {

        // this.material에 material을 주입받기
        this.material = material;
    }

    // getter 만들어보기
    public T getMaterial() {
        return material;
    }

    public String toString() {

        // material 내부의 toString 메소드 반환
        return material.toString();

    }

    public void printing() {
        material.doPrinting();
    }
}
