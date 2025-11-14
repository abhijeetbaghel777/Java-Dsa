class kitaab{
    void display(String a,String b){
        System.out.println("name of book is "+a+" and author is "+b);
    }
    void display(String na,String au,int x){
        System.out.println("book is "+na+"\nauthor is "+au+"\nprice is "+x);
    }
}
class book{
    public static void main(String[] args) {
        kitaab a1=new kitaab();
        a1.display("ramayan", "valmiki");
        a1.display("ramayan","valmiki",999);
    }
}