class area{
    void toatlarea(float x){
         System.out.println("Area oof circle is:"+3.14*x*x); 
    }
    void toatlarea(int l,int b){
        System.out.println("Area of rectangle:"+l*b);
    }
    void toatlarea(double a,double b){
        System.out.println("Area of triangle is:"+1/2*a*b);
    }
}
class main{
    public static void main(String[] args) {
        area a1=new area();
        a1.toatlarea(2);

    }
}