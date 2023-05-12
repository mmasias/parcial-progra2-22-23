public class ThreadsProgramming {
    public static void main (String[] args) {
        // monitor buffer
        Queue theBuffer;

        // producer's task
        Producer p;

        // consumer's multiple tasks
        Consumer[] c;

        // objects creation
        theBuffer = new Queue(5);
        p = new Producer(theBuffer);
        c = new Consumer[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Consumer(theBuffer);
        }

        // tasks' execution

        /*
            5 concurrent threads:
            - 1 Producer
            - 3 Consumers
            - main()
         */
        p.start();
        for (int i = 0; i < c.length; i++) {
            c[i].start();
        }
    }

}
