class person{
    void name(){
        System.out.println("Abhijeet");
    }
}
class student extends person{
    void standard(){
        System.out.println("11th");
    }
}
class monitor extends student{
    void discipline(){
        System.out.println("disciplined");
    }
}
class stud{
    public static void main(String[] args) {
        monitor m=new monitor();
        m.name();
        m.discipline();
        m.standard();
    }
}