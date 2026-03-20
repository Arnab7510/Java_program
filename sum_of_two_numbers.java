import java.util.*;

public class sum_of_two_numbers {
    public static void sum(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int a=ab.nextInt();
        System.out.println("Enter 2nd number ");
        int b=ab.nextInt();
        System.out.println("Result is  "+ (a+b));
    }
    public static void main(String[] args){
        System.out.println("Sum of two numbers....");
        sum();
    }
    
}
