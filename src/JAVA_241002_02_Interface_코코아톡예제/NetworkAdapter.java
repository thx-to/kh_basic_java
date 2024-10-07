package JAVA_241002_02_Interface_코코아톡예제;

public interface NetworkAdapter {

    // 인터페이스로 생성했기 때문에 자동으로 public abstract가 추가됨
    // 추상 메소드를 넣어야 하기 때문에
    void connect();
    void send(String msg);
}

class WiFi implements NetworkAdapter {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("Wi-Fi >> " + msg);
    }

}


class FiveG implements NetworkAdapter {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }

}


class Lte implements NetworkAdapter {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> " + msg);
    }

}