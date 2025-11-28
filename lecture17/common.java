import java.util.HashSet;
public class common {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,7,8};
        int arr1[]={1,2,3,4,9,0};
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        System.out.println("Duplicate values:");
        for(int y:arr1){
            if (set.contains(y)){
                  System.out.println(y);
            }
            else 
                continue;
        }
        
    }
}
