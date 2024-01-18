package thread;

public class CreateByExtendsThread {
    static class MyThread extends Thread {
        int loopCount;

        public MyThread() {
            this.loopCount = 0;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread getName() : " + Thread.currentThread().getName()
                        + ", loopCount : " + loopCount);
                loopCount++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
