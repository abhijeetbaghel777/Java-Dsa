import java.util.Arrays;

public class anagram {
      public static void main(String[] args) {
        String str="hello";
        String str1="hlloe";
        char ch[]=str.toCharArray();
        char ch1[]=str1.toCharArray();
        Arrays.sort(ch);
        String val1=new String(ch);
        String val2=new String(ch1);
        if(val1.equals(val2)){
            System.out.println("true");
        }
        else System.out.println("false");


        

      }
}

