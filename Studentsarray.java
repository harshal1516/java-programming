class Student{
    int rollno;
    String name;
    int marks;
}


public class Studentsarray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name =  "abharam";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name ="Lincon";
        s3.marks = 98;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for (int i=0;i<students.length;i++){
        //     System.out.println(students[i].name + ":" + students[i].marks);
        // } simple for loop

        for (Student s:students){
            System.out.println(s.name+ ":" + s.marks);//enhanced for loop
        }
    }
}
    