import java.util.Scanner;
public class binary_search {
    public static void main( String[] args){
        Scanner ab=new Scanner(System.in);
        int i,f=0;
        System.out.print("Enter array size");
        int n = ab.nextInt();
        int [] a = new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++){
            a[i]= ab.nextInt();
        }
        System.out.print("Enter the element has to be searched ");
        int x=ab.nextInt();
        int lb=0;
        int ub=n-1;
        while(ub>=lb){
            int mid=(lb+ub)/2;
            if(a[mid]==x){
                System.out.println("The data is found at the position"+(mid+1));
                f=f+1;
                break;
            }
            else if(mid>x){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        } 
        if(f==0){
            System.out.println("No data found");
        }

    }
}
