package multithreading;

public class Company {
    int n;
    bool flag=false; //false->consumer can't consume
    synchronized public void produce_item(int n){
        if(flag){
            wait();
        }
        this.n=n;
        System.out.println("Produced:"+n);
        flag=true;
        notify();
    }
    synchronized public int consume_item(){
        if(!flag){
            wait();
        }
        System.out.println("Consumed:" + n);
        flag=false;
        notify();
        return n;
    }
}
