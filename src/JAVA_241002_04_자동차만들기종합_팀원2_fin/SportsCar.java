package JAVA_241002_04_자동차만들기종합_팀원2_fin;

public class SportsCar extends Car {
    int fuelEconomy = 8;
    int speed = 250;
    int fuelTankSize = 30;
    int seatNumber = 2;

    public SportsCar(String name) {
        super(name);
    }

    @Override
    double totalPrice(int nop, int area, int add_Ons) {
        double tp = 0;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        tp = cnt * DESTINATION_LIST[area] / fuelEconomy * oneLOil;
        return Math.floor(tp);
    }

    @Override
    double totalOilCnt(int nop, int area, int add_Ons) {
        double to = 0;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        to = cnt * DESTINATION_LIST[area] / (fuelEconomy * fuelTankSize);
        return Math.ceil(to);
    }

    @Override
    double totalDistanceTime(int nop, int area, int weather, int add_Ons) {
        double tdt = 0;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        if(ADD_ONS[add_Ons] == 1) {
            tdt = cnt * DESTINATION_LIST[area] / (speed*1.2);
        }
        else tdt = cnt * DESTINATION_LIST[area] / speed;
        if(weather == 2 || weather == 3) tdt *= WEATHER[weather];
        return tdt*60 ;
    }
}