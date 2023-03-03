public class Student {
    // data/attributes
    private Name name;
    private String ic;
    private Address address;
    private String schoolname;
    private float[] marks = new float[5];

    // methods or operations
    public float calcAvg() {
        float sum = 0;
        for(float mark:marks){
            sum += mark;
        }
        return sum / 5;
    }

    public float calcMin() {
        float min = marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i] < min){
                min = marks[i];
            }
        }
        return min;
    }

    public void setName(Name thename) {
        name = thename;
    }

    void setMark(float mark, int i) throws Exception{
        if(i > marks.length -1){
            throw new IndexOutOfBoundsException("Array index out of bound");
        }
        if(mark >100 || mark <0){
            throw new Exception("Mark out of range");
        }
        else{
        marks[i] = mark;

        }

    }

    public Name getName() {
        return name;
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

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public float[] getMarks() {
        return marks;
    }



    void displayMarks(){
        for(float mark:marks){
            System.out.println(mark);
        }
    }

}
