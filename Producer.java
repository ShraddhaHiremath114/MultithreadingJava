public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;
    }
    public void run(){
        int i=1;
        while (true) {
            this.c.produceItems(i);
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}
