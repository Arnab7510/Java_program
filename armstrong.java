import java.util.Scanner;

public class armstrong {
    int n;
    void get(){
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a number-- ");
        n=ab.nextInt();
    }
    
    void calculate(){
        int s=0,i,x,l=0,y,r;

        x=n;
        while(x!=0){
            l++;
            x=x/10;
        }

        y=n;
        while(y!=0){
            r=y%10;
            int a=1;
            for(i=1;i<=l;i++){
                a=a*r;
            }
            s=s+a;
            y=y/10;
        }

        if(s==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[]args){
        armstrong ab=new armstrong();
        ab.get();
        ab.calculate();
    }
    
}
