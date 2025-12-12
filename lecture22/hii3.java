import java.util.*;
class hii3{
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=1;i<=20;i++){
        list.add(i);
       } 
       List<Integer> res=list.stream()
       .filter(n->n>5).toList();
       List<Integer> even=list.stream().filter(n->n%2==0).toList();
       List<Integer> odd=list.stream().filter(n->n%2!=0).toList();
       System.out.println("Greater than 5:");
       System.out.println(res);
       System.out.println("Odd numbers:");
       System.out.println(odd);
       System.out.println("Even numbers:");
       System.out.println(even);
       int oddsum=odd.stream().reduce(0,(a,b)-> a+b);
       int evensum=even.stream().reduce(0,(a,b)-> a+b);
       System.out.println("Odd sum= "+oddsum);
       System.out.println("Even sum= "+evensum);
    }
}