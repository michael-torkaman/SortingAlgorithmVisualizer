public class Algorithms {

    
    public static void InsertionSort(int[] arr, int delay, Visualizer visualizer){
     
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            visualizer.setArr(arr);
            visualizer.setComparedIndxes(key, j);
            visualizer.repaint();
            
            try {
                Thread.sleep(delay); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;


            visualizer.setArr(arr);
            visualizer.setComparedIndxes(key, j);
            visualizer.repaint();
            
            try {
                Thread.sleep(delay); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            }

            arr[j + 1] = key;

            visualizer.setArr(arr);
            visualizer.setComparedIndxes(key, j);
            visualizer.repaint();
            
            try {
                Thread.sleep(delay); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}