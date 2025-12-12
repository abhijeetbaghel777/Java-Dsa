import java.util.*;

class hiiii4 {
   public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<=15;i++){
        list.add(i);
    }
    List<Integer> skip=list.stream().skip(4).toList();// shuru se given size tak k skip kardega
    List<Integer> limit=list.stream().limit(2).toList();// jo size diya h wahi tak print karega
    List<Integer> sort=list.stream().sorted().toList();/*sorting karta h by default ascending order or agar b-a karenge toh descending dega */
    System.out.println(list);
    System.out.println(skip);
    System.out.println(limit);
    System.out.println(sort);
   } 
}
