/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week0_introduction;

import java.util.Scanner;

/**
 *
 * @author nd244
 */
public class introduction {public static void main(String[] args)
{
    System.out.println("welcome to unit 4 programming");

    System.out.println("i love peanut butter");// output
    // variables
    String name="";
    int number1=0;
    int number2=0;
    int total=0;
    Scanner kb=new Scanner (System.in);
    // processs
    System.out.println("enter your name"+ name);
    name=kb.next();
    System.out.println("hello "+name);
    
    System.out.println("enter first number");
    number1=kb.nextInt();
    System.out.println ("enter second numeber") ;
    number2=kb.nextInt();
    total=number1+number2;
    /////processs
    // outcome 
    System.out.println(name+" your total is "+total);
    System.out.println("thank youuuu");
}
}
