import java.util.Scanner;
public class a_calculator {
    public static void addition(int a,int b){        
        System.out.println("Result is  "+ (a+b));
    }
    public static void subtraction(int a,int b){        
        System.out.println("Result is  "+ (a-b));
    }
    public static void multiply(int a,int b){        
        System.out.println("Result is  "+ (a*b));
    }
    public static void division(int a,int b){  
        if(b!=0){      
            System.out.println("Result is  "+ (a/b));
        } else{
            System.out.println("Not divisible");
        }
    }
    
    public static void main(String[] args){
        while(true){
            Scanner ab=new Scanner(System.in);
            System.out.println("Enter 1st number ");
            int a=ab.nextInt();
            System.out.println("Choose the operator ( +,-,*,/)");
            char ch = ab.next().charAt(0);
            System.out.println("Enter 2nd number ");
            int b=ab.nextInt();
            switch(ch){
                case '+':
                    addition(a, b);
                    break;
                case '-':
                    subtraction(a, b);
                    break;
                case '*':
                    multiply(a, b);
                    break;
                case '/':
                    division(a, b);
                    break;  
                default:
                    System.out.println("Wrong choice");  
            }
        }
    }
}
