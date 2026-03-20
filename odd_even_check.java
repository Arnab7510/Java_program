import java.util.*;

public class odd_even_check {
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = ab.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");
        } else{
            System.out.println("The number is Odd");
        }
    }
}
