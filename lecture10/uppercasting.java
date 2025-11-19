class animal{

    void eat(){
        System.out.println("pizza");
    } void play(){
        System.out.println("football");
    }
}
class dog extends animal{
    void eat(){
        
        System.out.println("roti");
    }
    // void play(){
    //     System.out.println("volleyball");
    // }
    void greet()
    {
        System.out.println("bark");
    }
}

public class uppercasting {
    public static void main(String[] args) {
        animal s1=new dog();// uppercasting creating a child object with refrence of parent class
        s1.play();
       /* s1.greet(); this will not run coz when a chid object is created through 
        * refrence of a parent class then the object can access only those methods 
        which are both overridden in parent and child class
       */
    }
}
