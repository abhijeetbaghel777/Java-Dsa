class mythread extends Thread{
    public void run(){
        System.out.println("thread running");
        for(int i=0;i<4;i++){
    System.out.println("thread 1");
}
    }
}
class hello3 {
    public static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();
        for(int i=0;i<4;i++){
            System.out.println("main thread");
            try {
                 t1.join();
                Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        }

    }
}
