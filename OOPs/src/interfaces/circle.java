package interfaces;

public class circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.print("Area calculation:");
        System.out.println(i*j);
    }
    public static void main(String[] args){
          circle s1=new circle();
          s1.calculateArea();
        }
}
