import java.util.ArrayList;
import java.util.Scanner;
enum Type{
    O,
    F,
    L
}
class Train{
    int busNo;
    String from;
    String to;
    int distance;
    Type type;
    Train(int busNo,String from,String to,int distance,Type type)
    {
        this.busNo=busNo;
        this.distance=distance;
        this.from=from;
        this.to=to;
        this.type=type;
    }
    void show()
    {
        int dis=CalcFare();
        System.out.println(busNo+" "+from+" "+to+" "+distance+" "+type+" "+dis);
    }
    int CalcFare()
    {
        int k=0;
        if(type==Type.O)
            k=10;
        else if(type==Type.F)
            k=20;
        else
            k=24;
        return distance*k;
    }
}
public class Q8 {
   public static void main(String [] args)
   {
    Scanner Input= new Scanner(System.in);
        ArrayList<Train> arr=new ArrayList<>();
        while(true)
        {
            System.out.println("1-Add detail");
            System.out.println("2-Show details");
            System.out.println("3-Exit");
            String s=Input.nextLine();
            s=s.substring(13, 14);
            int k=Integer.parseInt(s);
            if(k==1)
            {
                String str=Input.nextLine();

                String []strArray=str.split(" ");
                int busNo=Integer.parseInt(strArray[0]);
                String from=strArray[1];
                String to=strArray[2];
                int distance=Integer.parseInt(strArray[3]);
                
                String type1="O";
                if(strArray.length>=5)
                    type1=strArray[4];
                Type x=Type.valueOf(type1);
                
                Train t=new Train(busNo,from,to,distance,x);
                arr.add(t);
            }
            else if(k==2)
            {
                for(int i=0;i<arr.size();i++)
                {
                    arr.get(i).show();
                }
            }
            else
                break;
        }
   } 
}
