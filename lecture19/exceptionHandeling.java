public class exceptionHandeling {
    public static void main(String[] args) {
        
        System.out.println("hello");
        try{
            int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);


        }catch(Exception e){
            System.out.println(e+" nahi hoga bhai");
        }
        System.out.println("byeeeee!!!");
    }
}
