import java.util.*;
class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(10);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            
        }
    }
}