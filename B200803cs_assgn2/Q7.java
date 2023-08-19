import java.util.Scanner;
import java.util.*;


class Student{
     public String name;
     public String rollNumber;
     public int height;
     public int weight;

     Student(String rollNumber,String name,int height,int weight)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.rollNumber=rollNumber;
    }

    void printStudentDetails()
    {
        System.out.println(rollNumber+", "+name+", "+height+"cm, "+weight+"Kg");
    }

}
public class Q7 {

    public static void main(String[] args){
         Scanner Input= new Scanner(System.in);
        System.out.printf("Enter number of students:");
        int n=Input.nextInt(); 
        Input.nextLine();
        System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line");
 
        Student s[]=new Student[n];
        int k=0;
        int t=n;
    while(n!= 0){
        String str=Input.nextLine();
            String[] temp=str.split(", ");
            int l=temp[2].length();
            int m=temp[3].length();
            temp[2]=temp[2].substring(0, l-2);
            temp[3]=temp[3].substring(0, m-2);
             int height=Integer.parseInt(temp[2]);
             int weight=Integer.parseInt(temp[3]);
             s[k]=new Student(temp[0], temp[1], height, weight);
   
            k++;
        n--;
    }
      n=t;
    for(int i=n-1;i>=0;i--)
    {
        for(int j=0;j<i;j++)
        {
            if(s[j].height>s[j+1].height)
            {
                Student s1=s[j];
                s[j]=s[j+1];
                s[j+1]=s1;
            }
        }
    }

    for(int i=0;i<n;i++)
        {
            s[i].printStudentDetails();
        }
    }}