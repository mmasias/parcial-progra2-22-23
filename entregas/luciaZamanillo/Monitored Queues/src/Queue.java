public class Queue {
    private int[] data;
    private int sigIn, sigOut, ocupied, size;

    public Queue (int size) {
        this.data = new int [size];
        this.size = size;
        this.ocupied = 0;
        this.sigIn = 1;
        this.sigOut = 1;
    }

    public synchronized void store (int x) {
        try {
            // it waits if there is no space left
            while (ocupied == size) wait();

            // inserts buffer
            data[sigIn] = x;
            sigIn = (sigIn + 1) % size;
            ocupied++;

            // notifies that the threads are waiting
            notifyAll();
        } catch (InterruptedException e) {
        }
    }

    public synchronized int extract() {
        int x = 0;
        try {
            // waits if there's no data
            while (ocupied == 0) wait();

            //extracts the buffer
            x = data[sigOut];
            sigOut = (sigOut + 1) % size;
            ocupied--;

            // notifies that the threads are waiting
            notifyAll();
        } catch (InterruptedException e) {
        }
        return x;
    }

}
