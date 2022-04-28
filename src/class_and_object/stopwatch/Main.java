package class_and_object.stopwatch;

public class Main {

    public static void main(String[] args) {
        int[] arr = randomArray(1,10,100000);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        selectionSort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getStopTime());
        System.out.println("Time: " + stopWatch.getElapsedTime());
    }

    public static int[] randomArray(int min, int max, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_index])
                    min_index = j;

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }
}
