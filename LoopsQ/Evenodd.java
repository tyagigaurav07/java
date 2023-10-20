package RD.LoopsQ;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] agrs){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=x.nextInt();
        System.out.println("Enter the second number");
        int b=x.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i+" is Even numbe");
            }
            else{
                System.out.println(i+" is odd numbe");
            }
        }
        x.close();
    }
}
