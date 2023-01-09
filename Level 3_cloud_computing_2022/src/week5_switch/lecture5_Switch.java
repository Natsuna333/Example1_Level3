package week5_switch;

import java.util.Scanner;

public class lecture5_Switch 
{
 static int mark;
 static Scanner kb=new Scanner (System.in);
 
 public static void example1()
 {
 System.out.println("enter your grade");
 mark=kb.nextInt();
 if(mark>=70)
 {
 System.out.println("First class");
 }
 else if (mark>=60)
 {
 System.out.println("2:1 class");
 }
 else if(mark>=50)
 {
 System.out.println("2:2 class");
 }
 else if (mark>=40)
 {    
 System.out.println("3rd class");
 }
  else if (mark>=35)
 {    
 System.out.println("simple pass");
 }
  else if (mark>=34)
  {     
 System.out.println("no pass");
  }
 }
 
 public static void example2()
 {
 int number1, number2;
 System.out.println("enter first number");
 number1=kb.nextInt();
 System.out.println("enter second number");
 number2=kb.nextInt();
     int number = 0;
 if(number>10)
 {
 if (number2>10)
 {
 System.out.println("both bigger than 10");
 }
 else
 {
 System.out.println("number1<10");
 }
 }
 
 
 }
 
 public static void example3()
 {
 char option=' ';
 System.out.println("press N,Q or P");
 option=kb.next().charAt(0);
 switch(option)
 {
     case 'Q':
     case 'q':
     System.out.println("Quitting");
     break;
     case 'P':
     case 'p':
    System.out.println("Pritnig File");
    break;
     default:
     System.out.println("unknown command - try again");
     break;
 }
 
 }
     
public static void example4()
{
    
}
 public static void menu()
 {
    int option=0;
    do{
        System.out.println("Selcet an option 1-4 or 5 to exit.");
    option=kb.nextInt();
    switch(option)
    {
        case 1:
            example1();
            break;
            
        case 2:
            example2();
            break;
            
        case 3:
            example3();
            break;
            
        case 4:
            example4();
            break;
            
        case 5:
            System.out.println("Thank you goodbye");
            break;
            
    }
    }while(option != 5);
 }

 public static void main(String[] args)
 {
   menu();
 }
}
