import java.util.ArrayList;// collection framewwork

class main1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
    ArrayList<Integer> list1=new ArrayList<>();
        list.add(8);
        list.add(10);
        list.add(1, 30);
        System.out.println(list);
        list1.add(10);
        list1.add(20);
        list1.addAll(1,list);

        System.out.println(list1);
    }
}
