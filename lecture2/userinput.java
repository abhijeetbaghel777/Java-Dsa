import java.util.Scanner;
public class userinput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your int value:");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Enter the float value:");
        float b=sc.nextFloat();
        System.out.println(b);
        
        System.out.println("Enter the string value:");
        
        String str =sc.nextLine();
        System.out.println(str);


    }
}