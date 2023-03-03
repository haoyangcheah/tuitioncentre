public class StudentBatch {
    // data section
    Student students[] = new Student[100];
    int currsz = 0;

    // operation
    void add(Student s, int i) {
        students[i] = s;
    }

    // method overloading
    void add(Student s) {
        students[currsz++] = s;
    }

    // find a particular student
    boolean find(String name) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currsz; i++) {
            if (students[i].getName().getFname().equals(name))
                return true;
        }
        return false;
    }

}
