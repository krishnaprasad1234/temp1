import java.util.ArrayList;
import java.util.Scanner;
class Student1
{
    public String name;
    public String rollNumber;
    public int height;
    public int weight;
    Student1(String rollNumber,String name,int height,int weight)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.rollNumber=rollNumber;
    }
    Student1 readStudent(String name,String rollNumber,int height,int weight)
    {
        Student1 k=new Student1(name, rollNumber, height, weight);
        return k;
    }
    void printStudentDetails()
    {
        System.out.println(rollNumber+','+name+", "+height+"cm, "+weight+"Kg");
    }
}
public class g {
    public static void main(String [] args)
    {
        
        Scanner myObj=new Scanner(System.in);
        int n=myObj.nextInt();
        Student1 arr[]=new Student1[n];
        for(int i=0;i<n;i++)
        {
            String str=myObj.nextLine();
            String[] temp=str.split(",");
             int height=Integer.parseInt(temp[2]);
             int weight=Integer.parseInt(temp[3]);
             arr[i]=new Student1(temp[0], temp[1], height, weight);
             
        }
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j].height>arr[j+1].height)
                {
                    Student1 s=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=s;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i].printStudentDetails();
        }  
    }
}