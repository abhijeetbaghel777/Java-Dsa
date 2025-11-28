import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();// it will print the data in order it is inserted
        set.add(10);
        set.add(5)
        ;
        System.out.println(set);
        TreeSet<Integer> set1=new TreeSet<>();
        set1.add(12);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);// it gives o/p sorted order irrespective of the insertion oreder

    }
}
