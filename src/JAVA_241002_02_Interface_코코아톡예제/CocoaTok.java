package JAVA_241002_02_Interface_코코아톡예제;

public class CocoaTok {
    private String to; // 상대방 이름
    private String msg; // 전달할 메시지

    public CocoaTok(String name) {
        to = name; // 상대방 이름을 입력받아 to에 집어넣기
    }

    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }

    // adapter.send를 상속받은 애들은 NetworkAdapter, 실제 상속을 담당하는
    // send 버튼을 누르면 메시지가 알아서 날아가게끔, 상속받은 애들이 만들어줌
    public void send(NetworkAdapter adapter) {
        adapter.send(msg);
    }

}
