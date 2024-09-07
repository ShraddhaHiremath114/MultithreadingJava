public class Company {

    int n;
    boolean chance=false;
    //false chance to Poducer
    //true chance to Consumer
    public synchronized int produceItems(int n){
        try{
            if(chance){
                wait();
            }
        }catch(Exception e){}
        
        this.n=n;
        System.out.println("Produced: "+this.n);
        chance=true;
        notify();
        return this.n;
    }
    public synchronized int consumeItems(){
        try{
            if(! chance){
                wait();
            }
        }catch(Exception e){}
        System.out.println("Consumed: "+this.n);
        chance=false;
        notify();
        return this.n;
    }
}
