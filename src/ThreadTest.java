public class ThreadTest extends Thread{

        public void run(){
            System.out.println("running thread name is:"+Thread.currentThread().getName());
            System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

        }
        public static void main(String args[]){
            ThreadTest m1=new ThreadTest();
            ThreadTest m2=new ThreadTest();
            m1.setPriority(Thread.MIN_PRIORITY);
            m2.setPriority(Thread.MAX_PRIORITY);
            m1.start();
            m2.start();

        }
    }
