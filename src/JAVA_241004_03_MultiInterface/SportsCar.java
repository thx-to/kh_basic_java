package JAVA_241004_03_MultiInterface;

// 한개의 상속(Car)과 두개의 인터페이스상속(Aircon, AutoDrive)
// AirCon과 AutoDrive는 추상메소드, 반드시 구현해줘야 함
public class SportsCar extends Car implements AirCon, AutoDrive{

    private boolean isAirCon;
    private int setTemp;
    private boolean isAutoDrv;
    private boolean isTurbo;

    // generator로 생성자 만들기
    // 인터페이스로 상속받아서 값을 넣어주면 됨 (기능 구현해주기)
    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, boolean isTurbo) {
        super(150, "white", "2000");
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.isTurbo = isTurbo;
    }

    // generator로 오버라이드 메소드 만들기
        // 설계명세에 넣기로 되어 있었던 기능들이기 때문에
    @Override
    public void airConON() {
        System.out.println("에어컨의 전원을 켭니다.");
    }

    @Override
    public void airConOFF() {
        System.out.println("에어컨의 전원을 끕니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        System.out.println("에어컨의 온도를 " + tmp + "도로 설정합니다.");
    }

    @Override
    public void autoDrvOn() {
        System.out.println("자율주행 모드를 켭니다.");
    }

    @Override
    public void autoDrvOFF() {
        System.out.println("자율주행 모드를 끕니다.");
    }


    // 출력을 위한 구간
    public void viewInfo() {

        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";

        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("연식 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);

    }
}
