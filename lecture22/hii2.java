/*Stream APIs have inbuilt functions
does not stores data instead works on collection/arrays */

import java.util.*;

class hii2 {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=10;i<=50;i=i+10){
        list.add(i);

    }
   List<Integer> res= list.stream()
    .filter(n->n<40)//filter function filter the value on the certain condition
    .toList();//Accumulates the elements of this stream into a List.
    System.out.println(list);
    System.out.println("After filetration:");
    System.out.println(res);
    List<Integer> mapres=list.stream().map(n->n*2)//Returns a stream consisting of the results of applying the given function to the elements of this stream
    .toList();
    System.out.println("After multiplication");
    System.out.println(mapres);
    /*reduce function-> */
    System.out.println("Array sum:");
    int data=list.stream().reduce(0,(a,b)->a+b);
    System.out.println(data);
  }  
}
