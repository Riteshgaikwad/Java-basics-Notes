//Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative
//Solution:-

import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       if(num==0){
        System.out.println("The number is nor negative nor positive");
       }
       else if(num>0){
        System.out.println("The number is positive");
       }
       else{
        System.out.println("The number is negative");
       }
       sc.close();
    }
    
}

//Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
//Solution:-

import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       double temp=103.5;
       if(temp>100){
        System.out.println("You have a fever");
       }
       else{
        System.out.println("You don't have fever");
       }
       sc.close();
    }
    
}

//Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case
//Solution:-

import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       System.out.println("Enter the week number(1-7):");
       int week=sc.nextInt();
       switch(week){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid input ! Please enter the value between 1 and 7 ");
       }
       sc.close();
    }
    
}

//Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not
//Solution:-

import java.util.Scanner; //its an header file for taking an input from the user

public class basics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // declare scanner as an sc
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        boolean x=year%4==0;
        boolean y=year%100!=0;
        boolean z= (year%100==0 && year%400==0);
        if(x && (y || z)){
            System.out.println("Leap year");

        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }

}
