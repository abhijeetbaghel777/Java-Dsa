class student{
    String name;
    int roll;
    int marks;
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }
}
class oops{
    public static void main(String[] args) {
        student obj=new student();
        obj.name="abhijeet";
        obj.roll=9;
        obj.marks=91;
        obj.display();

    }
}