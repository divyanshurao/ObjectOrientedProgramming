package multithreading;

public class threadOperations implements Runnable{
    public void run(){
        System.out.println("Performing various thread operations");
        try {
            Thread.sleep(2000);
        }catch(Exception e){

        }
        System.out.println("Performing various thread operations after sleep");
    }

    public static void main(String[] args){
        threadOperations thread=new threadOperations();
        Thread myThread=new Thread(thread);
        myThread.start(); // Start the thread
        System.out.println(myThread.getName()); 
        myThread.setName("namedThread");
        System.out.println(myThread.getName());
        System.out.println(myThread.getId());
        System.out.println(myThread.getPriority());
    }
}
