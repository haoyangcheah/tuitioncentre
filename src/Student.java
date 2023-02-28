public class Student {
    // data/attributes
    private Name name;
    private String kp;
    private String address;
    private String schoolname;
    private float[] marks = new float[5];

    // methods or operations
    float calcAvg() {
        return 0;
    }

    float calcMin() {
        return 0;
    }

    void setName(Name thename) {
        name = thename;
    }

    void setMark(float mark, int i) throws Exception{
        if(i > marks.length -1){
            throw new IndexOutOfBoundsException("Array index out of bound");
        }else{
        marks[i] = mark;

        }

    }

    public Name getName() {
        return name;
    }

    public String getKp() {
        return kp;
    }

    public void setKp(String kp) {
        this.kp = kp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    void displayMarks(){
        for(float mark:marks){
            System.out.println(mark);
        }
    }
    public static void main(String[] args) {
        Student stud0 = new Student();
        try{ //smtg in here can cause exception

        stud0.setMark(10,0);
        stud0.setMark(10,1);
        stud0.setMark(30,2);
        stud0.setMark(40,3);
        stud0.setMark(50,8);
        }
        catch(Exception e){ //action to taken if got error
            System.out.println("Got error");
            e.printStackTrace();

        }
        stud0.displayMarks();
    }
}
