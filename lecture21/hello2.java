class MyThread extends Thread{// multithread is creating a class that extends an inbuilt class threads
    public void run(){//it is called by run() in the main class
System.out.println("thread is running");
for(int i=0;i<4;i++){
    System.out.println("thread 1");
}
    }
} 
class hello2 {
    public static void main(String[] args) {// multithreading
        System.out.println(Thread.currentThread().getName());// a mutithread always has a main thread this method is used get the name of the main thread
        MyThread t1=new MyThread();
        t1.start();//starts new thread-> calls run()
        try {
            t1.join();//Waits for this thread to terminate.
        } catch (Exception e) {
            
        }//starts new thread-> calls run()
        for(int i=0;i<4;i++){
            System.out.println("main thread");
        }
    }
}
