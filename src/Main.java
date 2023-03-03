import java.util.Scanner;
public class Main
{

    // application code
    public static void main(String[] args) {

        //create student profile
        Student cheah = new Student();
        Name name = new Name();
        name.setFName("Cheah");
        name.setMName("Hao");
        name.setLName("Yang");
        cheah.setName(name);


        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(cheah);


        // find a student from student batch 2023
        Scanner scan = new Scanner(System.in);
        System.out.print("Find student: ");
        String stu = scan.nextLine();
        boolean isIn = sb2023.find(stu);
        if(isIn){
            System.out.println(stu+ " is found.");
        }else{
            System.out.println(stu + " is not found.");
        }


        //set mark for 5 trial test
        try{
            cheah.setMark(100,0);
            cheah.setMark(90,1);
            cheah.setMark(80,2);
            cheah.setMark(90,3);
            cheah.setMark(100,4);
        }
        catch(Exception e){ //action to taken if got error
            System.out.println("Error detected.");
            e.printStackTrace();
        }


        // calculate and print the avg
        float avg = 0;
        avg = cheah.calcAvg();
        System.out.println("Avg = " + avg);

        // calculate the min marks for cheah
        System.out.println("Min = " + cheah.calcMin());


        cheah.displayMarks();

        //create object for math teachers
        MathTeachers teachers = new MathTeachers();
        //assign student to each teacher based on avg mark
        teachers.addStudent(cheah,avg);

        //display the student list for teacher
       teachers.displayStud(teachers.raju);
     }

}
