import java.util.Scanner;
public class Q3 {

    public static void main(String[] args){

        Scanner Input= new Scanner(System.in);
        String s=Input.nextLine();
        int arr[]=new int[256];
        String h="";
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==0){
                h+=s.charAt(i);
                arr[s.charAt(i)]=1;
            }
        }   

        System.out.println(h);
    }
    }