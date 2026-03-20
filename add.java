import java.util.Scanner;
public class add {
    int a;
    int b;

    void get(){
        Scanner ab=new Scanner(System.in);
        System.out.println("1st number-- ");
        a=ab.nextInt();
        System.out.println("@nd number-- ");
        b=ab.nextInt();
    }
    void sum(){
        int c=0;
        c=a+b;
        System.out.println("sum is "+c);
    }
    public static void main(String[] args){
        add obj1= new add();
        obj1.get();
        obj1.sum();
    }
}
