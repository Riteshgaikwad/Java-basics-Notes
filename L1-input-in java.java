import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       System.out.println("Enter the value of a:");  // print the statement
       int a=sc.nextInt();  //taking a as an input from the user
       System.out.println("Enter the value of b:"); //print the statement
       int b=sc.nextInt(); //taking b as an input
       int sum=a+b; // declare sum as an int and store the sum of a and b
       System.out.println("The sum of a and b is:"+sum); // print the sum of both 
       sc.close();
    }
    
}


// now lwt us solve some of the questions:-
/*
1) product of a and b
*/
//solution:-
import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
 public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       System.out.println("Enter the value of a:");  // print the statement
       int a=sc.nextInt();  //taking a as an input from the user
       System.out.println("Enter the value of b:"); //print the statement
       int b=sc.nextInt(); //taking b as an input
       int product=a*b; // declare sum as an int and store the product  of a and b
       System.out.println("The sum of a and b is:"+product); // print the product of both 
       sc.close();
    }
 }
    
/*
2)Area of a circle
*/
//Soiltion:-

import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
      System.out.println("Enter the radius of a circle:-");//print Statement
      float radius=sc.nextInt(); //Taking radius as an input 
      float area=3.14f*radius*radius; // Using the formula of area of circle and store the result in float data type 
      System.out.println("The area of a circle is:"+area); //print the area of the circle
       sc.close();
    }
    
}
