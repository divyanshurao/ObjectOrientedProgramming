package multithreading;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Value of i is: " + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
              }
        }
    }
    public static void main(String[] args){
        MyThread t1=new MyThread();
        // t1.start(); // Can't as start is part of thread class
        // t1.run();

        //Hence to overcome this and utilize thread class
        Thread th=new Thread(t1);
        th.start();
    }
}
