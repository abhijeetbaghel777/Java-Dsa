import java.util.*;
public class min_max {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:-");
        for(int i=0;i<5;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Maximum element:");
        int max=arr[0];
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
               
            }
           
           
        }
         System.out.println(max);
         System.out.println("Minimum element:-");
         int min=arr[0];
         for(int i=0;i<5;i++){
            if(arr[i]<min){
                min=arr[i];
            }
         }
         System.err.println(min);
         System.out.println("Average:-");
         int sum=0;
         for(int i=0;i<5;i++){

        sum=sum+arr[i];
         }
         System.out.println(sum/5);
    }
}
