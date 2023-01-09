/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3_objects;
import java.util.Random;
import java.util.Scanner;
public class Lecturer_objects 
{ 
    
    public static void main (String[] args)
    {
    Random random=new Random();
    Scanner kb=new Scanner(System.in);
    String name=new String("James");
    String name2= "herlen Martin";
    Person p1=new Person();
    Person p2=new Person();
    Person p3=new Person();
    int number=2;
    p1.setName("Helen");
    p2.setName("Jhon");
    p3.setName("Charly");
    p1.setAge(30);
    p2.setAge(40);
    p3.setAge(16);
    p1.setGender('F');
    p2.setGender('M');
    p3.setGender('O');
    p1.showInf();
    p2.showInf();
    p3.showInf();
    String city=new String("Manchester");
    System.out.println(city);
    for(int index=0;index<city.length();index++)
    {
        System.out.println(city.charAt(index));
    }
    
    }
    
    
}