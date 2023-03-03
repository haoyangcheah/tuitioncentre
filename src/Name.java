public class Name {
    private String fname;
    private String lname;
    private String mname;

    //parameterized constructor
    public Name(String fname,String mname,String lname){
         this.fname = fname;
         this.mname = mname;
         this.lname = lname;
    }

    //default constructor
    public Name(){

    }
    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.setFname(fname);
    }

    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.setMname(mname);
    }

    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.setLname(lname);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
