package oopConcept;

public class EncapsulationConcept {

    private String name;
    private int id;
    private String DOB;

    public EncapsulationConcept(){}

    public EncapsulationConcept(String name, int id, String DOB) {
        this.name = name;
        this.id = id;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
