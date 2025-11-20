interface a{
    void sleep();
    void eat();
}
interface  b {
void sleep();  
void eat(); 
}
class c implements a,b{
    public void sleep(){
        System.out.println("hello");
    }
    public void eat(){
        System.out.println("pizza");
    }
}
class d extends c{
    public void sleep(){
System.out.println("soja bhai");
    }

}


class multiinheri{
    public static void main(String[] args) {
        c s1=new c();
        s1.eat();
        s1.sleep();
        d s2= new d();
        s2.eat();
        s2.sleep();
    }
}