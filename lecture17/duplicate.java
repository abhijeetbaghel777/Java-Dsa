import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int arr[]={1,2,3,4,5};
        for(int x:arr){
            set.add(x);
        }
        int count=arr.length;
        int c=0;
        for(int y:set){
           c++;
        }
        if(c==count)
            System.out.println("duplicate nahi h");
        else
            System.err.println("duplicate element ha");
    }
}
