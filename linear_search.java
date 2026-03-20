//linear search
import java.util.Scanner;
class linear_search
{
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        int i,flag=0;
        System.out.print("Enter the size of the array :");
        int n = ay.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array elements :");
        for (i = 0; i < n; i++) {
            a[i] = ay.nextInt();
        }
        System.out.println("Enter the searching element :");
        int x = ay.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.print("Element found at the position of " + (i + 1));
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
    }
}