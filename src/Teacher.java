import java.util.ArrayList;

public class Teacher {
    // data
    private Name name;
    private String ic;
    private Address address;
    private int numyearexp;
    private String qualification;

    private ArrayList<Student> ClassStudents = new ArrayList<>();

    public Teacher(int numyearexp){
        this.numyearexp = numyearexp;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNumyearexp() {
        return numyearexp;
    }

    public void setNumyearexp(int numyearexp) {
        this.numyearexp = numyearexp;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public ArrayList<Student> getClassStudents() {
        return ClassStudents;
    }

    public void addStudent(Student stud) {
        ClassStudents.add(stud);
    }

    // op



}
