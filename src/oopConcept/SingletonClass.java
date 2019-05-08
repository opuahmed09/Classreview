package oopConcept;

public class SingletonClass {

    private static SingletonClass obj = new SingletonClass();

    private  SingletonClass(){}

    public static SingletonClass getInstance(){
        return obj;
    }
    public void calendar(){
        System.out.println("This method from Singleton");
    }
}
