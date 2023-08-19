import java.util.Scanner;
import java.util.*;


class Student{
    String name;
    String Roll;
    int cgpa;
    double percentage;
    Student(String name,String Roll,int cgpa){
        this.name=name;
        this.Roll=Roll;
        this.cgpa=cgpa;
        this.percentage=9.5*cgpa;
       
    }
      void printStudentDetails()
    {
      System.out.println(name+" "+Roll+" "+cgpa+" "+this.percentage+"%");
    }
}
public class Q6 {

    public static void main(String[] args){
         Scanner Input= new Scanner(System.in);
        System.out.printf("Enter number of students:");
        int n=Input.nextInt(); 
            System.out.printf("Enter students details");

        System.out.println();
            Student s[]=new Student[n];
            int i=0;
        while(n!= 0){
            String name=Input.next();
            String Roll=Input.next();
            int cgpa=Input.nextInt();
            s[i]=new Student(name, Roll, cgpa);
            s[i].printStudentDetails();
            n--;
            i++;
        }
    }}