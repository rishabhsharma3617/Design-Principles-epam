package Calculator_Java;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Operations calculate =new Operations();
        Scanner scan=new Scanner(System.in);
        float a,b;
        char o;
        System.out.println("Enter first number then operator and second number");
        System.out.println("like :- 5 + 6");
        a=scan.nextFloat();
        o=scan.next().charAt(0);
        b= scan.nextFloat();


        float output=calculate.getOutput(a,o,b);

        if(output!=-1){
            System.out.println(output);
        }
        else{
            System.out.println("please enter valid input");
        }
    }
}
