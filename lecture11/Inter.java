
interface a{
    abstract void login();// it is not necessary to write abstract coz unlike abstract class a interface cant have not abstract method
}
class b implements a{
    public void login(){
        System.out.println("hello");

    }
    
}
class Inter{
    public static void main(String[] args) {
        b s1=new b();
        s1.login();

    }
}