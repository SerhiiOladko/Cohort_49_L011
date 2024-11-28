package lessons.lesson.task_01;

public class Task_1 {
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyTheard2 myTheard2 = new MyTheard2();

        // mainThread1.run();
        // myTheard2.run();
        myThread1.start();

        Thread thread = new Thread(myTheard2);
        thread.setDaemon(true);
        thread.start();



        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

