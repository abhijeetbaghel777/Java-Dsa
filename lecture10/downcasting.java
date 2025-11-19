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
    void play(){
        System.out.println("volleyball");
    }
     void greet()
    {
        System.out.println("bark");
    }
}

public class downcasting {
    public static void main(String[] args) {
     animal s1=new dog();
     dog s2=(dog)s1;// down casting
     s2.greet();//with this now the methods that are not overrideen can also be accessed
     s2.eat();

    }
}
