public class Producer extends Thread{
    private Queue buffer;

    public Producer(Queue c) {
        this.buffer = c;
    }

    public void run() {
        int value = 0;
        while(true) {
            buffer.store(value);
            value++;
        }
    }

}
