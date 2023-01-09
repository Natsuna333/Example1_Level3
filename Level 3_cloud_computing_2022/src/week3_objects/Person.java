/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3_objects;

public class Person 
{ 
  //attributes 
  String name;
  int age;
  char gender;
  static int counter=0;
  // constructor 
  public Person()
  {
      System.out.println("New object person");
      counter++;
      System.out.println("counter"+counter);
  }
  public void setName(String N)
  {
  this.name=N;
  }
  public void setAge(int A)
  {
      this.age=A;
  }
  public void setGender(char G)
  {
      this.gender=G;
  }
  public String getName()
  {
  return this.name;
  }
  public int getAge()
  {
   return this.age;
  }
  public char getChar()
  {
  return this.gender;
  }
  public void showInf()
  {
  System.out.println ("Name:" + this.name +
          "Age:"+ this.age + 
          "Gender:" + this.gender);
  }
}