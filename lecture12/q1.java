// import java.util.Random;

class fan {
    private int fanspeed=5;
    public void  getspeed(){
        System.out.println("Speed of fan is "+fanspeed);
    }
    public void setspeed(int x){
    if(x>fanspeed)
        System.out.println("speed can't be greater then max speed");    
    else if(x==0)
        System.out.println("the fan stoppped...");
    else if(x<0)
        System.out.println("speed can't be less then zero");
    else
        System.out.println("the speed is now "+x);
           
}
}
class q1{
    public static void main(String[] args) {
       fan f1=new fan();
    f1.setspeed(-1);   }
}