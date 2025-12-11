class mythread extends Thread{
    public void run(){
       for(int i=1;i<=10;i++){
        System.out.println("downloading...... "+i*10+"%");
        try {
            Thread.sleep(i*200);
        } catch (Exception e) {
            
        }
       }
    }
}
class hello4 {
    public static void main(String[] args) {
      mythread t1=new mythread();
      t1.start();
      for(int i=1;i<=10;i++){
        System.out.println(i*2);
        try {
            Thread.sleep(i*100);
        } catch (Exception e) {
            
        }
      }  
    }
}
