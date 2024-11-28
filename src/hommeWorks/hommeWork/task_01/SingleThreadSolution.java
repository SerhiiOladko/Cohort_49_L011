package hommeWorks.hommeWork.task_01;



public class SingleThreadSolution {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int count = 0;
        for (int i = 1; i <= 2_000_000; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                count++;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Результат в один поток: " + count);
        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");
    }
}

