import java.util.Scanner;
public class Q1{
     public static void main(String[] args){
        Scanner Input= new Scanner(System.in);
        int n=Input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Input.nextInt();
        }

        int count=0;
        int ans=n;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                if(count>1){ans--;}
            }
            else{count=0;}
        }
        System.out.println(ans);
     }
}