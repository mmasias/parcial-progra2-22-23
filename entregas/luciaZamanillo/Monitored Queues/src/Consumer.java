public class Consumer extends Thread {
    private Queue buffer;

    public Consumer (Queue c) {
        this.buffer = c;
    }

    public void run() {
        int dat;
        while(dat < 10) {
            dat = buffer.extract();
            System.out.println(dat);
        }
    }
}
