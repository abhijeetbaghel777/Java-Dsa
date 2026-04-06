import java.util.*;
public class rev {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int start=0;
        int mid=arr.length/2;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
