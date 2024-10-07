package JAVA_240930_05_에어컨만들기예제;

public class SmartAirCon extends AirCon {

    private boolean isAutoMode;

    public SmartAirCon() {
        isAutoMode = false;
    }

    public void setAutoMode (boolean autoMode) {
        isAutoMode = autoMode;
    }

    @Override
    public void airConInfo() {
        super.airConInfo();
        String autoModeStr = isAutoMode ? "ON" : "OFF";
        System.out.println("자동 온도 조절 : " + autoModeStr);
    }

    // 자동 온도 조절 기능 구현, 설정 온도는 20도로 자동 지정해서 동작
    @Override
    public void setAirConState() {

        if(isAutoMode) {
            windStep = 2;
            setTemp = 20;
            if (curTemp > setTemp) {
                System.out.println("냉방기를 작동합니다.");

                // 냉방기 ON, 난방기 OFF
                isCooler = true;
                isHeater = false;

                // 현재온도가 설정온도보다 낮은경우 난방기를 작동하여 실내온도 높이기
            } else if (curTemp < setTemp) {
                System.out.println("난방기를 작동합니다.");
                // 냉방기 OFF, 난방기 ON
                isCooler = false;
                isHeater = true;
            } else {
                isCooler = false;
                isHeater = false;
            }
        }



    }
}