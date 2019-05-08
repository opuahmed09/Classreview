package oopConcept;

public class OverRiding extends PolymorphismClass {


    public void polymor(int num, String name) {
        num = 8;
        name = " people n Tech";
        System.out.println(num + " Is for " + name);
        System.out.println("Over Riding is happening");
    }

    public void polymor(String name, int num) {

    }

    public void polymor(String name, int num, boolean isDisplayed) {

    }

    public void polymor(String name, boolean isDisplayed, int num) {

    }


}
