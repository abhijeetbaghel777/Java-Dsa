class employee{// parent class created
    void work(){
        System.out.println("working!!!!");//method
    }
}
class manager extends employee{// child class created
    void attendmeeting(){//method
        System.out.println("Buddy meeting attend kar raha huu!!!");
    }
}
class inheritence{
    public static void main(String[] args) {
        employee m=new employee();
        manager n=new manager();
        m.work();
        //  m.attendmeeting(); it is   not possible because  coz a parent class cant acces methods from a child class
        n.attendmeeting();
        n.work();
    }
}