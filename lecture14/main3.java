import java.util.LinkedList;
class main3 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=10;i<=50;i=i+10){
            list.add(i);
        }
        // for(int num:list)
        //     System.out.println(num);
        // // get set
        // System.out.println(list.get(1));
        list.set(0, 20);
        
       
        System.out.println("last element "+list.getLast());
        System.out.println("first element "+list.getFirst());
        
        
    }
}
