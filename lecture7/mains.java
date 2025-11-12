class rectangle {
    int length;
    int breadth;
    rectangle(int lenght,int breadth){
        this.length=lenght;
        this.breadth=breadth;

    }
    int area(){
         return length*breadth;
    }
    int  perimeter(){
        return 2*(length+breadth);
    }
    void display(){
        System.out.println("lenght="+length);
        System.out.println("breadth="+breadth);
        System.out.println("area="+ area());
        System.out.println("perimeter="+perimeter());
        System.out.println("-----------------");
    }
}
class mains{
    public static void main(String[] args) {
        rectangle r1=new rectangle(20,30);
        rectangle r2=new rectangle(80,45);
        r1.display();
        r2.display();
    }
}
  