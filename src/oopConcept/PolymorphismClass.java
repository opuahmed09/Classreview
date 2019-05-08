package oopConcept;

public class PolymorphismClass {

    public PolymorphismClass() {
    }


    //Method overLoading

    public void polymor(int num, String name) {
        num = 8;
        name = " people n Tech";
        System.out.println(num+" Is for "+name);
    }

    public void polymor(String name, int num) {

    }

    public void polymor(String name, int num,boolean isDisplayed) {

    }

    public void polymor(String name,boolean isDisplayed, int num) {

    }


}
