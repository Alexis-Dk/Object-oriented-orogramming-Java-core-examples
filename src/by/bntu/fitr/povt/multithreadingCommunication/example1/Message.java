package by.bntu.fitr.povt.multithreadingCommunication.example1;

public class Message {
    // поле, с которым будут работать потоки через вызовы геттеров и сеттеров
    private String msg;
     
    public Message(String str){
        this.msg=str;
    }
 
    public String getMsg() {
        return msg;
    }
 
    public void setMsg(String str) {
        this.msg=str;
    }
 
}
