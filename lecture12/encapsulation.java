class atm{
    private int totalBalance=1000000;
    public void getTotal(){
        System.out.println(totalBalance);
    }
    public void setBalance(int amount){
        if(amount>0 && totalBalance >=amount)
          {  totalBalance-=amount;
             System.out.println(totalBalance);
    }
   
}
 public void setdeposit(int mount){
        totalBalance+=mount;
        System.out.println(totalBalance);
    }
}






class encapsulation {
    public static void main(String[] args) {
        atm a1=new atm();
        a1.getTotal();
       // a1.setBalance(20000);
       a1.setdeposit(400);
    }
}
/*encapsulation and abstraction both hide but abstraction hides the implementation but encapsulation
protects data and provides security */