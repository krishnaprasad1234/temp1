import java.util.Scanner;
import java.util.*;
public class Q4 {

    public static void main(String[] args){
         Scanner Input= new Scanner(System.in);
        String s=Input.nextLine();
        int n=s.length();
        int arr[][]=new int[n][n];
        int maxi=1;
        for(int i=0;i<n;i++){
            arr[i][i]=1;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                arr[i][i+1]=2;
                maxi=2;
            }
            else{
                arr[i][i+1]=1;
            }
        }
        for(int k=3;k<n;k++){
            for(int i=0;i<n-k;i++){
                if(s.charAt(i)== s.charAt(i+k-1)){
                    arr[i][i+k-1]=2+arr[i-1][i+k-2];
                    
                }
                else{ 
                    arr[i][i+k-1]=0;
                }
                maxi=Math.max(maxi,arr[i][i+k-1]);
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(maxi);
    }
}