import java.util.Scanner;

public class prime {
    int n;
    void get(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a number-- ");
        n=ab.nextInt();
    }
    void calculate(){
        int f=0,i=1;
        for(i=1;i<=n;i++){
            if(n%i==0){
                f++;
            }
        }
        if(f==2){
            System.out.println("prime");
        }
        else{
            System.out.println("composite");
        }
       
    }
    public static void main(String[]args){
        prime ab=new prime();
        ab.get();
        ab.calculate();
    }
    
}
