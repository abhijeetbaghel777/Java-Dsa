public class sum {
    public static void main(String[] args) {
        int sum=0;
        int a=123;
        while(a>0)
        {
            int ldigit=a%10;
            a=a/10;
            sum=sum+ldigit;
        }
        System.out.println(sum);
    }
    
}
