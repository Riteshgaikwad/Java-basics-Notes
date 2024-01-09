/*

now let us study about operators and it types one by one:-
1)Arithmetic Operators:-
 The arithmetic operators consist operation such sa +,-,*,/,%
 Now let us understaand with an example:-
*/

//Binary opeartor

import java.util.Scanner; //its an header file for taking an input from the user

import org.ietf.jgss.GSSContext;
public class basics { 
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);  // declare scanner as an sc
       System.out.println("Enter the value of a and b:");
        int a=sc.nextInt(); //input of a
        int b=sc.nextInt();//input of b
        System.out.println("The sum of two nuber is :"+(a+b)); //preform + operation 
        System.out.println("The substraction of two number is :"+(a-b)); //perform - operation
        System.out.println("The product of two number is:"+(a*b));//perform * operation
        System.out.println("The division of two number is:"+(a/b));//perform / operation
        System.out.println("The remainder of two number is:"+(a%b));//perform % operation

    }
    
}


//unary Operator
// Preincement ++a , Post-increment a++
/*
2)Relational Operator:-
 These operators are used to compare the two operands or two values 
 It checks the condition and return the output   i.e. True or False
 operators are: == , > , < , <= , >= ,!= 
 Now let us understaand with an example:-
*/


/*
3)Logical Operator:-

 && logical AND:-
    if both the statements are true then return TRUE else return FALSE
 || logical OR:-
    if both the statements are false then FALSE else return TRUE
 ! logical NOR:-
    if the statement is true it return FALSE similarly, if the statement is false then return TRUE
*/


/*
4)Assignment Operator:-
  = :- Assign the values eg:a=b value of a is given to b
  += :- increment the values eg:a+=10 which means a=a+10;
  -= :- substract the values the value eg:a-=4 which means a=a-4;
  *= :- product the values eg:a*=4 which means a=a*4;
  /= :- divide the values eg:a/=2 which means a=a/2;
  
*/

// after undestatnding all this operators and their types you can solve the questions for better understanding which are given below:-

/*
Question : What will be the output of the following programs :
(i)
public class Test {
public static void main(String[] args){
int x = 2, y = 5;
int exp1 = (x * y / x);
int exp2 = (x * (y / x));
System.out.print(exp1 + “ , ”);
System.out.print(exp2);
}
}
(ii)
public class Test {
public static void main(String[] args) {
int x = 200, y = 50, z = 100;
if(x > y && y > z){
System.out.println("Hello");
}
if(z > y && z < x){
System.out.println("Java");
}
if((y+200) < x && (y+150) < z){
System.out.println("Hello Java");
}
}
}
gaikwadritesh2003@gmail.com
(iii)
public class Test {
public static void main(String[] args){
int x, y, z;
x = y = z = 2;
x += y;
y -= z;
z /= (x + y);
System.out.println(x + " " + y + " " + z);
}
}
(iv)
public class Test {
public static void main(String[] args){
int x = 9, y = 12;
int a = 2, b = 4, c = 6;
int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
System.out.println(exp);
}
}
(v)
public class Test {
public static void main(String[] args){
int x = 10, y = 5;
int exp1 = (y * (x / y + x / y));
int exp2 = (y * x / y + y * x / y);
System.out.println(exp1);
System.out.println(exp2);
}
}
*/


