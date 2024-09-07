public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for(int i=5;i>=1;i--){
            System.out.println("MyThread2"+i);
            
        }
    }
    
}
