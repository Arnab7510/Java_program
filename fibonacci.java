import java.util.Scanner;

public class fibonacci {
    int n;
    void get(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a number-- ");
        n=ab.nextInt();
    }
    
    void calculate(){
        int a=0,b=1,c=0;
        System.out.print(a+" ,");
        System.out.print(b);
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(" ,"+c);
            a=b;
            b=c;
        }

       
    }
    public static void main(String[]args){
        fibonacci obj=new fibonacci();
        obj.get();
        obj.calculate();
    }
    
}
