import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search:");
        int s=sc.nextInt();
        int found=0;
        for(int i=0;i<n;i++){
            
            if(s==arr[i]){
                found++;
                break;
            }
        }  
        if(found==1)
        System.out.println(s+" mil gaya");
        else
        System.out.println(s+" nahi mila");
        
       
        
    }
    
}
