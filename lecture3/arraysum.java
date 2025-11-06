import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];int sum=0;
        System.out.println("Enter the elemets of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("sum is "+sum);



        
    }
    
}
