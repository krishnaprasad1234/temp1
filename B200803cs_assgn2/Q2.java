import java.util.Scanner;
public class Q2 {

    public static void main(String[] args){
    Scanner Input= new Scanner(System.in);
    String s=Input.nextLine();
    int count=1;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            count++;
        }
    }
    System.out.println("Words count is "+count);
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) != ' '){
            System.out.println("'"+s.charAt(i)+"' "+(int)s.charAt(i));
        }
    }
    }
}
