import java.io.*;
import java.util.*;
class thread implements Runnable{
    public void run(){
        try{
                Thread.sleep(2000);
        }
        catch(InterruptedException e){e.printStackTrace();}
        for(int i=0;i<5;i++){
            System.out.print(i+"\n");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
        System.out.println("State of thread1 after .join() on thread2 : "+Test.thread1.getState());
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){}
        
    }
}
public class Test implements Runnable{
    public static Thread thread1;
    public static Test obj;
    public static void main(String args[]){
        obj=new Test();
        thread1=new Thread(obj);
        System.out.println("State of thread1 after creating it : "+thread1.getState());
        thread1.start();
        System.out.println("State of thread1 after .start() : "+thread1.getState());
    }
    public void run(){
        thread x=new thread();
        Thread thread2=new Thread(x);
        System.out.println("State of thread2 after creating it : "+thread2.getState());
        thread2.start();
        System.out.println("State of thread2 after .start() : "+thread2.getState());
	try{
		Thread.sleep(500);
	}
	catch(InterruptedException e){}
        System.out.println("State of thread2 .sleep() : "+thread2.getState());
        try{
            thread2.join();
        }
        catch(InterruptedException e){}
        
        System.out.println("State of thread2 : "+thread2.getState());
    }
}