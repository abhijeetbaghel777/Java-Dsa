public class equal {
    public static void main(String[] args) {
        // String str="hello java";
        // String str1="hello java";
        // System.out.println(str1==str);// in it refrence variable is being compared
        // System.out.println(str.equals(str1));// in it the og strings are being compared
        String str=new String("hello");// in it all new object is created and two object can't be same due to which these two string can  e compared directly
        
        
        String str1=new String("hello");
        System.out.println(str.equals(str1));// in it the values of the objects are compared inplace of the two objects created


    }
    
}
