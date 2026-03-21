import java.util.Scanner;

public class special {
    int n;
    void get(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a number-- ");
        n=ab.nextInt();
    }
    void calculate(){
        int p=1,s=0,x,r;
        x=n;
        while(x!=0){
            r=x%10;
            p=p*r;
            s=s+r;
            x=x/10;
        }
        if((p+s)==n){
            System.out.println("Special");
        }
        else{
            System.out.println("Not Special");
        }
        
    }
    public static void main(String[]args){
        special obj=new special();
        obj.get();
        obj.calculate();
    }
    
}
