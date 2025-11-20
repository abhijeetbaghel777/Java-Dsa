abstract class shape{
    abstract void area();
}
class Circle extends shape{
   double radius;
   Circle(double radius){
    this.radius=radius;
   }
   void area(){
     System.out.println("The area of circle : "+3.14*radius*radius);
   }
}
class rectangle extends shape{
   int lenght,breadth;
   rectangle(int lenght ,int breadth){
    this.lenght=lenght;
    this.breadth=breadth;

   }
   void area(){
    System.out.println("The area of rectangle: "+lenght*breadth);
   }
    }
class hello{
    public static void main(String[] args) {
        shape sc=new Circle(8);
        sc.area();
        shape sc1=new rectangle(7,5);
        sc1.area();
    }
}
    