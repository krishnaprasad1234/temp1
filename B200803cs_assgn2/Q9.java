import java.util.ArrayList;
import java.util.Scanner;

class VideoStore{
    String title;
    int status;
    VideoStore(String title)
    {
        this.title=title;
        this.status=1;
    }
}
public class Q9 {
    public static void main(String []args)
    {
        Scanner Input=new Scanner(System.in);
        ArrayList<VideoStore> arr=new ArrayList<VideoStore>();
        while(true)
        {
            int k=Input.nextInt();
            
            String title;
            if(k==1){
                int n=Input.nextInt();
                Input.nextLine();
                for(int i=0;i<n;i++)
                {
                    String str=Input.nextLine();
                    VideoStore v=new VideoStore(str);
                    arr.add(v);
                } 
            }
            if(k==2){
                Input.nextLine();
                title=Input.nextLine();
                for(int i=0;i<arr.size();i++)
                {
                    if(arr.get(i).title.equals(title))
                    {
                        if(arr.get(i).status==1)
                            System.out.println("Available");
                        else   
                            System.out.println("NotAvailable");
                        
                    }
                } 
            }
            if(k==3){
                Input.nextLine();
                title=Input.nextLine();
                for(int i=0;i<arr.size();i++)
                {
                    if(arr.get(i).title.equals(title))
                    {
                        
                        arr.get(i).status=0;
                    }
                } 
            }
            if(k==4){
                Input.nextLine();
                title=Input.nextLine();
                for(int i=0;i<arr.size();i++)
                {
                    if(arr.get(i).title.equals(title))
                    {
                        arr.get(i).status=1;
                    }
                } 
            }
            if(k==5){
                for(int i=0;i<arr.size();i++)
                {
                    System.out.printf(arr.get(i).title);
                } 
            }
            if(k==6){
                break;
            }
        }
    }
}