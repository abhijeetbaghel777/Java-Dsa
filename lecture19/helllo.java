// throwing exceptiuon manually
public class helllo {
    public static void main(String[] args) {
        try{
            voteage(12);
        }catch (Exception e){
          System.out.println(e);
        }
        try{
            voteage(19);
        }catch(Exception e){
System.out.println(e);
        }
    }
     static void voteage(int age){
        System.out.println("check for vote");
        if(age<18){
            throw new IllegalArgumentException ("nahi de sakte vote");
        }else
            System.out.println("dede vote bhai");
    }
}
