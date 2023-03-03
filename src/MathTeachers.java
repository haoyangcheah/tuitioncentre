import java.util.ArrayList;

public class MathTeachers {

    Teacher hassan = new Teacher(7);
    Teacher gopal = new Teacher(5);
    Teacher li = new Teacher(8);
    Teacher minah = new Teacher(6);
    Teacher raju = new Teacher(10);

    public void addStudent(Student stud,float avg){
        if(avg <=30){
            hassan.addStudent(stud);
        } else if (avg <=50) {
            gopal.addStudent(stud);
        } else if (avg <= 70) {
            li.addStudent(stud);
        } else if (avg <= 80) {
            minah.addStudent(stud);
        }else{
            raju.addStudent(stud);
        }
    }

    public void displayStud(Teacher t){
        ArrayList<Student> ClassStudents= t.getClassStudents();
        for(Student stud: ClassStudents){
            System.out.print("Students List: ");
            System.out.println(stud.getName().getFname());
        }
    }
}
