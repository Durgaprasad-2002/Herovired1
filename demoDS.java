class WorkerThread implements Runnable {
    private int data;

    public WorkerThread(final int anydata) {
        this.data = anydata;

    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.data + " X " + i + " = " + this.data * i);
        }
    }
}

public class demoDS {
    public static void main(final String[] args) {
        WorkerThread obj1 = new WorkerThread(2);
        final Thread t1 = new Thread(obj1);
        t1.start();
        t1.setName("first thread");

        WorkerThread obj2 = new WorkerThread(10);
        final Thread t2 = new Thread(obj2);
        t2.start();
        t2.setName("second thread");

        WorkerThread obj3 = new WorkerThread(5);
        final Thread t3 = new Thread(obj3);
        t3.start();
        t3.setName("third thread");

        WorkerThread obj4 = new WorkerThread(6);
        final Thread t4 = new Thread(obj4);
        t4.start();
        t4.setName("fourth thread");
    }

}