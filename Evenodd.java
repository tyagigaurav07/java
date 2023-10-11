import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=x.nextInt();
        String input=(n%2==0)?"Even":"Odd";
        System.out.println(input);
        x.close();
    }
    
}
