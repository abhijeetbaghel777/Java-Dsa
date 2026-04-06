import java.util.*;
public class index {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int found=1;
        int index=0;
       for(int i=0;i<10;i++){
        if(arr[i]==target){
             index=i;
             break;
        }
        else {
            found=-1;
        }
        
       }
       if(found==1){
        System.out.println("found at index "+index);
       }
       else{
        System.out.println("element not found");
       }
    }
}
