package classes;

public class ChildClassOfAbstractClass extends MyAbstractClass{
    @Override
    public void abstractMethod() {
        System.out.println("Child class implemented abstract method, making this concrete");
    }
}

class Strat{
    public static void main(String[] args){
        ChildClassOfAbstractClass obj= new ChildClassOfAbstractClass();
        obj.concreteMethod(); // from parent class
        obj.abstractMethod(); // from child class

        // We can take reference of parent as well, while creating an object
        MyAbstractClass obj2= new ChildClassOfAbstractClass();
        obj2.abstractMethod();
        obj2.concreteMethod();
    }
}
