class car {
    car(int x){// passsing a parameter in constructor
        System.out.println(x);
    }
}
class constparameter{
    public static void main(String[] args) {
        car obj=new car(25);
        car obj1=new car(58);
    }
}
