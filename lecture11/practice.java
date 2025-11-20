interface Walkable{
    void run();
    void walk();

}
interface Runable{
    void run();
    void walk();

}
class human implements Walkable,Runable{
    public void run(){
        System.out.println("Human is running");
    }
    public void walk(){
        System.out.println("Human is walking.");
    }
}
class practice{
    public static void main(String[] args) {
        
        human h1= new human();
        h1.run();
        h1.walk();
    }
}