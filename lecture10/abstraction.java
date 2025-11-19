abstract class oggy{// abstract class ka object nahi banaya ja sakta
// abstract class always have to be inherited
abstract void eat();
// it is a abstract method iski body iski child class me declare hogi
// abstract method ka overriding karna compulsory h
void play(){// non abstract method
    System.out.println("football");
}
}
class jack extends oggy{
    void eat(){
System.out.println("david putra 3000cc");
    }
    void play(){
        System.out.println("harley davidson");
    }
}

 class abstraction {
    public static void main(String[] args) {
        jack s1=new jack();
        s1.eat();
        s1.play();
    }
}
