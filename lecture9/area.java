import java.util.Scanner;
class shape{
    void figure(){
        System.out.println("Drawing a shape");
    }
}
class circle extends shape{
    void area(int r){
        System.out.println("the area is:"+3.14*r*r);
    }
}
class area{
   public static void main(String[] args) {
     circle a=new circle();
    
    Scanner sc=new Scanner(System.in);
 
    System.out.println("Enter the radius:");
    int i=sc.nextInt();
    a.figure();
    a.area(i);
   }

}