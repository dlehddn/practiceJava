package thread;

public class CreateByImplRunnable {

    static class MyThread implements Runnable {

        static int loopCount;
        int millisecond;

        public MyThread(int millisecond) {
            this.loopCount = 0;
            this.millisecond = millisecond;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread getName() : " + Thread.currentThread().getName()
                        + ", loopCount : " + loopCount);
                loopCount++;
                try {
                    Thread.sleep(this.millisecond);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread runnable1 = new MyThread(1000);
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
