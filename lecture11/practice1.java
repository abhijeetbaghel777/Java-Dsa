interface a{
    void display();
}
interface b{
    void display();
}
class Demo implements a,b{
    public void display(){
        System.out.println("bhai bhai!!");
    }
}


class practice1 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.display();
    }
}
