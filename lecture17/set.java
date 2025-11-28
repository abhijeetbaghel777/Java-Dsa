import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(200);// no duplicate values aere inserted
        set.add(300);
        System.out.println(set);
        for(int x:set){
            System.out.println(x);
        }
    }
}
