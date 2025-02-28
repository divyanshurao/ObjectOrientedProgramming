package polymorphism;

public class overloading {
    public void read(){
        System.out.println("Simple read method");
    }

    public void read(String bookname){
        System.out.println("Reading: " + bookname);
    }
    public static void main(String[] args){
        overloading obj=new overloading();
        obj.read();
        obj.read("Psychology of Money");
    }
}
