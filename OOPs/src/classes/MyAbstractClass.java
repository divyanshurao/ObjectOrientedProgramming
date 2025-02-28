package classes;

// This class has 50% abstraction
// Since this is abstract, hence no object can be created. (If object is created then what code would run if abstract method is called)
abstract public class MyAbstractClass {

    // This is a concrete method
    public void concreteMethod(){
        System.out.println("My concrete Class");
    }

    //abstract method
    abstract public void abstractMethod();
}
