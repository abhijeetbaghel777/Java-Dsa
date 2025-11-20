interface shape{
    double area();
}
class circle implements shape{
    public double area(){
        int r=5;
        return 3.14*r*r;
    }
}
class practice2{
    public static void main(String[] args) {
        circle c1=new circle();
        c1.area();
        System.out.println(c1.area());
    }
}
