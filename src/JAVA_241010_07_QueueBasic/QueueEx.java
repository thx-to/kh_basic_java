package JAVA_241010_07_QueueBasic;
// Queue는 FIFO(First In First Out)
// 자바에서 Queue는 LinkedList를 활용해 생성, LinkedList import 필요

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {

        // Messge의 클래스 타입으로 집어넣음
        Queue<Message> msgQueue = new LinkedList<>();

        // offer(객체) 주어진 객체를 Queue에 추가 (예외없음, 실패시 false 반환)
        msgQueue.offer(new Message("Mail", "PHAM"));
        msgQueue.offer(new Message("SMS", "KIM"));
        msgQueue.offer(new Message("Kakao", "MO"));

        // msgQueue가 비어 있지 않으면 반복문 돌려
        while (!msgQueue.isEmpty()) {

            // Queue에서 객체를 꺼내서 반환 (비어 있으면 null)
            // 메시지 변수는 클래스 타입의 참조변수
             Message msg = msgQueue.poll();

             // 객체니까 객체 내에 있는 값을 봄
            switch (msg.getCommand()) {
                case "Mail" :
                    System.out.println(msg.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.getTo() + "에게 문자를 보냅니다.");
                    break;
                case "Kakao" :
                    System.out.println(msg.getTo() + "에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}


class Message {

    private String command;
    private String to;

    // generate로 생성자 자동으로 만들어주기
    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }


    // generate로 getter / setter 자동으로 만들어주기
    public String getCommand() {
        return command;
    }
    public void setCommand(String command) {
        this.command = command;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

}