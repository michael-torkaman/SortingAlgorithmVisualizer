

import javax.swing.*;
import java.util.Random;

public class driver {

    public static void main(String[] args) {
        int[] array = generateRandomArray(100);

        JFrame frame = new JFrame("Sorting Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        Visualizer visualizer = new Visualizer(array);
        frame.add(visualizer);

        frame.setVisible(true);

        //Algorithms.InsertionSort(array, 10, visualizer);
        Algorithms.selectionSort(array, 10, visualizer);
        //Algorithms.mergeSort(array, 10, visualizer);
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generate random numbers between 0 and 99
        }

        return array;
    }
}
