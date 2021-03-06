package by.bntu.fitr.povt.multithreading.waitAndNotify;

public class Waiter implements Runnable{
     
    private Message msg;
    private Thread thread;
   
     
    public Waiter(Message m){
        this.msg = m;
        thread = new Thread(this, "waiter");
        thread.start();
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try{
                System.out.println(name + " ждем вызов метода notify: " + System.currentTimeMillis() + " 1");
                msg.wait();
                Thread.sleep(3000);
                System.out.println(name + " был вызов метода notify: ");
                //Thread.interrupted();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + " был вызов метода notify: " + System.currentTimeMillis());
            // обработаем наше сообщение
            System.out.println(name + " : " + msg.getMsg());
        }
    }
    
//    @Override
//    public void run() {
//    	w();
//    }
//    
//
//    public synchronized void w() {
//        String name = Thread.currentThread().getName();
//
//            try{
//                System.out.println(name + " ждем вызов метода notify: " + System.currentTimeMillis());
//                msg.wait();
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//            System.out.println(name + " был вызов метода notify: " + System.currentTimeMillis());
//            // обработаем наше сообщение
//            System.out.println(name + " : " + msg.getMsg());
//
//    }
    
}
