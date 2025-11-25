import java.util.ArrayList;

class main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=10;i<=50;i=i+10){
            list.add(i);
         }
    //     System.out.println(list);
    //    System.out.println(list.get(2)); 
    //    list.set(2,99);
    //    System.out.println(list);
    //    System.out.println(list.get(2)); 
    //    System.out.println("First element: "+list.getFirst());
    //    System.out.println("last element: "+list.getLast());
    // search operation
    int size=list.size();
    System.out.println("The size of the list: "+size);
    System.out.println("Index of 20 is "+list.indexOf(20));
// size & empty
System.out.println(list.isEmpty());
// individual printing
for(int j=0;j<list.size();j++){
    System.out.println(list.get(j));
}
        
    }
}
