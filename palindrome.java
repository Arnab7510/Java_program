import java.util.Scanner;

public class palindrome {
    int n;
    void get(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a number-- ");
        n=ab.nextInt();
    }
    
    void calculate(){
        int s=0,x,r;

        x=n;
        while(x!=0){
            r=x%10;
            s=s*10+r;
            x=x/10;
        }

        
        if(s==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[]args){
        palindrome obj=new palindrome();
        obj.get();
        obj.calculate();
    }
    
}
    

