import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        int num=a;
        int pallindrome=0;
        while(a>0)
        {
            int ldigit=a%10;
            a=a/10;
            pallindrome=pallindrome*10+ldigit;
            
        }
        if(num==pallindrome)
        {
            System.out.println(num+" is Pallindrome");
        }
        else
        System.out.println(num+" is not pallindrome");
    }
    
}
