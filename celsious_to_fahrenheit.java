import java.util.Scanner;
class celsious_to_fahrenheit{
    public static void main(String[] args){
        int b;
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter celsious degree : ");
        int n=ab.nextInt();
        b=((n*9)/5)+32;
        System.out.println("In fahrenheit ="+b);
    }
}