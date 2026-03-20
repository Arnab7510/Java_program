import java.util.Scanner;
public class factorial {
    int n;
    void get(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a number-- ");
        n=ab.nextInt();
    }
    void fact(){
        int f=1,i=1;
        while(i<=n){
            f=f*i;
            i+=1;
        }
        System.out.println("Factorial is--"+f);
    }
    public static void main(String[]args){
        factorial ab=new factorial();
        ab.get();
        ab.fact();
    }
}
