interface vehicle{// default method
default void start(){
    System.out.println("vehicle is starting...");
}
}
class car implements vehicle{
    public void start(){
        System.out.println("vehicle has started...");
    }
}
class practise3 {
    public static void main(String[] args) {
        car c1= new car();
        c1.start();
    }
}
