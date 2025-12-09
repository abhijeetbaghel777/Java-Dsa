import java.util.ArrayList;
import java.util.Iterator;

public class Main {
public static void main(String[] args) {
   int[] arr={40,5,3,10,20,3};
   int target=10;
   ArrayList<Integer> list=new ArrayList<>();
   for(int x: arr){
    list.add(x);
   }
   Iterator<Integer> it=list.iterator();
   while(it.hasNext()){
    int temp=it.next();
    if(temp==target)
        break;
   }
for(int y:list){
    if(y<target)
        it.remove();
}
while(it.hasNext()){
    System.out.println(it.next());
}
}    
}
