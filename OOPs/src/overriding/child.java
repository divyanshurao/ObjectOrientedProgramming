package overriding;

public class child extends parent{
    @Override
    public void m2() {  //overriding method
        super.m2();
        System.out.println("Overriden method by child class");
    }
}
class main {
    public static void main(String[] args){
        child obj = new child();
        obj.m1();
        obj.m2();
    }
}