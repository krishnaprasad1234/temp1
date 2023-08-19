import java.util.Scanner;
import java.util.*;
public class Q5 {
    public static void main(String[] args){
         Scanner Input= new Scanner(System.in);
        String s=Input.nextLine();
        int k=Input.nextInt();
        int flag=0;
        int flag1=0;
        int i=0;
        for(;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i+1)=='e'){
                    flag=1;
                }
                break;
            }
        }
        i++;
        for(;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i+1)=='n'){
                    flag1=1;
                }
                break;
            }
        }
        int sum=0; 
        
        if(flag==1 && flag1==1){
            sum+=(k*120);
            sum=sum+(sum*5)/100;
        }
         if(flag==1 && flag1==0){
            sum+=(k*100);
            sum=(sum*105)/100;
        }
         if(flag==0 && flag1==1){
            sum+=(k*120);
        }
         if(flag==0 && flag1==0){
            sum+=(k*100);
        }
                
        System.out.print(sum);
    }
}