/*
Conditional Statements:-

1)if else Statements:-

 Syntax:-
  if(condition){
  }
  else{
  }
*/

// let us solve some of the questions:-
//Q1-print largest of two:-
import java.util.Scanner;
class basic{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the valus of a,b and c:");
  int a=sc.nextInt(); //taking input value of a
  int b=sc.nextInt(); //taking input value of b
  
  if(a>b){                                               // if statemnent with its condition
   System.out.println("The greater number is A:"+a);
  }
  else{                                                     // condition not satisfied the move to else statement
  System.out.println("The greater value is B:"+b);
  }
  }
}

//Q2-Print weather the number is odd or even:-
import java.util.Scanner;
class basic{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number:");
 int num=sc.nextInt();
 if(num%2==0){                                 // if statemnent with its condition
 System.out.println("The number is EVEN");
 }
 else{                                          // condition not satisfied the move to else statement
 System.out.println("The number is ODD");
 }
 }
}

/*
1.2)else if Statements:-
syntax:-
if(condition){

}
else if(condition){

}
else{
}
*/

// let us see some of the examples:-
//Q1:-Income tax calculator:- income<5L then 0%tax income between 5 to 10L then 20% tax income > 10L then 30%tax

import java.util.Scanner;                            //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);            // declare scanner as an sc
       System.out.println("Enter your income:-");
       int income=sc.nextInt();                        // user income as an input
       int tax=0;
       if(income<500000){
        System.out.println("the tax is:"+tax);         // income less than 5 L tax is 0
       }
       else if(income>500000 && income<1000000){ 
        tax=(int)(income*0.2);                       //updating the value of tax according to the income
        System.out.println("The tax is:-"+tax);
       }
       else{
        tax=(int)(income*0.3);                      //updation value of tax according to the income
        System.out.println("The tax is:-"+tax);
       }
    }
    
}

//Q2-print largest of three:-
import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       System.out.println("Enter the value of a,b and c:-");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a>b){
        if(a>c){
            System.out.println("Greatest:"+a);

        }
        else{
            System.out.println("Greatest:"+c);
        }
        }
        else{
            if(b>c){
                System.out.println("Greatest:"+b);
            }
            else{
                System.out.println("Greatest:"+c);
            }
        }
    }
    
}

//now let us optimise the solution in another way

import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       System.out.println("Enter the value of a,b and c:-");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a>b && a>c){
        System.out.println("Greatest:"+a);
       }
       else if(b>c){
        System.out.println("Greatest:"+b);
       }
       else{
        System.out.println("Greatest:"+c);
       }
    }
    
}


