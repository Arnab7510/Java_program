import java.util.*;

public class grading_system {
    public static void main( String[] args){
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = ab.nextInt();
        if( marks<=100 && marks>=90){
            System.out.println("A++");
        } else if(marks<90 && marks>=70){
            System.out.println("A");
        } else if(marks<70 && marks>=50){
            System.out.println("B");
        } else if(marks<50 && marks>=30){
            System.out.println("C");
        } else{
            System.out.println("Better Luck Next Time");
        }
    }    
}
