import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the no of elements :");
        int n=sc.nextInt();
        int even=0;
        int[] arr= new int[n];
        int odd=0;
        System.out.println("Enter the elements pf array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }
            else
            odd++;
        }
        System.out.println("No of even values="+even);
        System.out.println("No of odd values="+odd);
    }
    
}
