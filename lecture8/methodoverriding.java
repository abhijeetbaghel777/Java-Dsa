
class animal{
    void eat(){
        System.out.println("pixxa");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("roti");
    }
    void parenteat(){
        super.eat();
    }
}


class methodoverriding {// can not be used without inheritence
public static void main(String[] args) {
    dog s1=new dog();// a child class object can be made from the parent class refrence but vice versa is not possible
    s1.eat();
    s1.parenteat();
}}// agar parent class k refrence se dog class ka object banayenge toh super keyword k through parent class ka function access nahi kar payenge
