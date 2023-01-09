
import java.util.Scanner;

 
public class numberTest {
    
    public static void main(String[] James )
    {
   int number1, number2;
    Scanner kb=new Scanner (System.in);
    System.out.println("Enter Number 1");
    number1=kb.nextInt();
    System.out.println("Enter number 2");
    number2=kb.nextInt();
    if(number1>number2)
        
    { System.out.println("number1 is bigger");
}
    else if (number2>number1)
    {
        System.out.println("number2 is bigger");
    }
    else {
        System.out.println("They are equal");
    }}

}
