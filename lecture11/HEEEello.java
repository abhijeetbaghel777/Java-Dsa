abstract class animal{
    abstract  void sound();
    
}
class dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("Cat meows");
    }

}



class HEEEello {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.sound();
        cat c1=new cat();
        c1.sound();
    }
}
