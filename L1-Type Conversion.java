import java.util.Scanner; //its an header file for taking an input from the user
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       /*
        Now first let us understand when conversions can occur:-

        bytes--> short ---> int --->float--->long--->double

        for example:- We can convert int to long but we cannot convert long to int
        */
        int a=25;
        long b=a; //This will run withount any error

        long c=25;
        //int d=c; // It will through an error while compilation that we cannot convert long into int

        // so we study that Java do not allow any conversions but we forcely made them to do the conversions
        //for example:-try to converst float into int
        float x=25.14f;
        int y=(int)x;
        System.out.print(y);//here the output will be 25 wich is an int data type

        /*
         Similarly, every character also have a specific number assigned to it 
         let wus study about it as well
         */

         char ch='a';
         char ch2='b';
         int number=ch; // here number will store int valur of character 'a'
         int number2=ch2; //here number2 will store int value of character 'b'
         System.out.println(number); //print int value 'a'
         System.out.println(number2); //print int value pf 'b'
       sc.close();
    }
    
}
