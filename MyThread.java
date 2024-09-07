public class MyThread extends Thread{
    public void run(){
        // System.out.println("My Thread");
        for(int i=1;i<=5;i++){
            System.out.println("MyThread"+i);
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static void main(String[] args) {
        
        MyThread t1=new MyThread();
        t1.start();
        System.out.println("Main Thread");

        MyThread2 t2=new MyThread2();
        Thread th=new Thread(t2);
        th.start();
    }
}