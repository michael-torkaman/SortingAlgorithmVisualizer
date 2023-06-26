public class Algorithms {

    
    public static void InsertionSort(int[] arr, int delay, Visualizer visualizer){
     
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            visualizer.setArr(arr);
            visualizer.setComparedIndxes(i, j);
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
            visualizer.setComparedIndxes(i, j);
            visualizer.repaint();
            
            try {
                Thread.sleep(delay); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            }

            arr[j + 1] = key;

            visualizer.setArr(arr);
            visualizer.setComparedIndxes(i, j);
            visualizer.repaint();
            
            try {
                Thread.sleep(delay); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
     public static void mergeSort(int[] arr, int delay, Visualizer visualizer) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left, delay, visualizer);
        mergeSort(right, delay, visualizer);

        merge(arr, left, right, delay, visualizer);

    }
    private static void merge(int[] arr, int[] left, int[] right, int delay, Visualizer visualizer) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }

            visualizer.setArr(arr);
            visualizer.setComparedIndxes(i + j - 1, k - 1);
            visualizer.repaint();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (i < leftSize) {
            arr[k++] = left[i++];

            visualizer.setArr(arr);
            visualizer.setComparedIndxes(i + rightSize - 1, k - 1);
            visualizer.repaint();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (j < rightSize) {
            arr[k++] = right[j++];

            visualizer.setArr(arr);
            visualizer.setComparedIndxes(i + j - 1, k - 1);
            visualizer.repaint();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void selectionSort(int[] arr, int delay, Visualizer visualizer){
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minIndx = i;
            for (int j = i+1; j < n; j++){

            visualizer.setArr(arr);
            visualizer.setComparedIndxes(i,j);
            visualizer.repaint();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                if (arr[j] < arr[minIndx])
                    minIndx = j;    
        }
            int temp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = temp;
            
            //redraw to visualize change
            visualizer.setArr(arr);
            visualizer.repaint();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}