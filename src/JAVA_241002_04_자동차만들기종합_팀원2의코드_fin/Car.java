package JAVA_241002_04_자동차만들기종합_팀원2의코드_fin;

public abstract class Car {
    String name;
    //부산,대전,강릉,광주
    int[] DESTINATION_LIST = {0, 400, 150, 200, 300};
    double[] WEATHER = {0, 0, 1.2, 1.4};
    int[] ADD_ONS = {0, 1 ,2};
    int oneLOil = 2000; // 기름 1L 당 금액
    public Car(String name) {
        this.name = name;
    }
    abstract double totalPrice(int nop, int area, int add_Ons);  // 총 비용
    abstract double totalOilCnt(int nop, int area, int add_Ons); // 총 주유 횟수
    abstract double totalDistanceTime(int nop, int area, int weather, int add_Ons); // 총 이동 시간

}