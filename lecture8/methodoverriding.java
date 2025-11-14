
class animal{
    void eat(){
        System.out.println("pixxa");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("roti");
    }
}


class methodoverriding {// can not be used without inheritence
public static void main(String[] args) {
    animal s1=new dog();// a child class object can be made from the parent class refrence but vice versa is not possible
    s1.eat();
}}
