/*threads->A lightweight sub-process

The smallest unit of execution

Part of a program that runs independently

👉 A Java program can have one thread (main thread) or multiple threads running at the same time.
Multithreading means:

Running multiple threads simultaneously to do multiple tasks in parallel.

✔ Improves performance
✔ Utilizes CPU efficiently
✔ Useful for multitasking
 */
class MyThread extends Thread{// multithread is creating a class that extends an inbuilt class threads
    public void run(){//it is called by run() in the main class
System.out.println("thread is running");
for(int i=0;i<4;i++){
    System.out.println("thread 1");
}
    }
} 
class hello1 {
    public static void main(String[] args) {// multithreading
        System.out.println(Thread.currentThread().getName());// a mutithread always has a main thread this method is used get the name of the main thread
        MyThread t1=new MyThread();
        t1.start();//starts new thread-> calls run()
        for(int i=0;i<4;i++){
            System.out.println("main thread");
        }
    }
}
