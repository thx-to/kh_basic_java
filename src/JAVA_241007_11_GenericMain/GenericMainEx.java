package JAVA_241007_11_GenericMain;

public class GenericMainEx {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

        // 객체 만들어주기
        // 객체에 대한 메모리가 실제로 Heap영역에 들어가야함
        powderPrinter.setMaterial(new Powder());

        // 해당하는 프린터에 대한 객체 가져오기
        Powder powder = powderPrinter.getMaterial();

        System.out.println(powder.toString());
        powder.doPrinting();


        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();

        System.out.println(plastic.toString());
        plastic.doPrinting();


        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();

        nylonPrinter.setMaterial(new Nylon());
        Nylon nylon = nylonPrinter.getMaterial();

        System.out.println(nylon.toString());
        nylon.doPrinting();

    }
}
