public class MyThreadPriorityDemo extends Thread{
    public static void main(String[] args) {
        /*
         * public static int MIN_PRIORITY->1
         * public static int NORM_PRIORITY->By Default and its value is 5
         * public static int MAX_PRIORITY->10
         */

        Thread th=Thread.currentThread();
        System.out.println(th);

        String name=th.getName();
        System.out.println(name);

        int priority=th.getPriority();
        System.out.println(priority);

        long id=th.getId();
        System.out.println(id);

        State state=th.getState();
        System.out.println(state);

        //setName("Mythread"),sleep(5000),run(),start()
    }
}
