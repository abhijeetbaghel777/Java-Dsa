 class methodoverloading
  {
    void add(int a){
        System.out.println(a);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        methodoverloading m=new methodoverloading();
        m.add(10);
    }
}
