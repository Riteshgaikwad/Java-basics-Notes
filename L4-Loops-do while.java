//Now let us study about do while loops
/*
Syntax:-
 do{ 
 
 // do something
 
 }while(condition);
*/

//Q1:-Keep entering numbers till user enters a multiple of 10.
import java.util.Scanner; //its an header file for taking an input from the user

public class basics {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the number:");
            int n=sc.nextInt();
            if(n%10==0){
                break;           // we use break statement to exit the loop
            }
            System.out.println(n);
        }while(true);
    }

}

//Q2:-Display all numbers entered by user except multiple of 10

import java.util.Scanner; //its an header file for taking an input from the user

public class basics {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the number:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;   // we use continue to skip an iteration
            }
            System.out.println("Number was:"+n);
        }while(true);
    }

}
