/*
**Conditional statement**
2)Ternaray operator:-

Syntax:-
variable = condition?Statement 1 : statement 2 ;
 - Here if the condition is true the it executes the statement 1 
 - If the conditiom is not satisfied or false the the statement 2 is executed
 
for example:-
 int larger=(5>3)?5:3;
*/

//Let us solve some of the questions:-
//Q1:-Check if student will pass or fail if marks>=33 then pass and if marks<33 then fail

import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);         // declare scanner as an sc  
       System.out.println("Enter the marks of the student:-");
       int marks=sc.nextInt();
       String result=marks>=33?"pass":"fail";    // storing the String output from the condition if its turue then result=pass else result=fail
       System.out.println(result);
       
    }
    
}

