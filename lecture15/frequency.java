import java.util.*;
class frequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr={2,2,5,5,3,7,6,9,7,9};
        for(int x:arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
      
}
}
