package multithreading;

public class MyThread2 extends Thread{
    public void run(){
        System.out.println("Run method of thread");
    }
    public static void main(String[] args){
        MyThread2 t2=new MyThread2();
        t2.start(); // Since start is already implemented in Thread class

        // To execute parallel executing MyThread thread here
        MyThread t1=new MyThread();
        Thread th=new Thread(t1);
        th.start();
    }
}
