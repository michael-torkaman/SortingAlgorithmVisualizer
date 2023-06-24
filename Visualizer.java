import javax.swing.JPanel;
import java.awt.*;

public class Visualizer extends JPanel {
    private int[] arr;
    private int highLightIndx_1, highLightIndx_2;
    private int delay;

    Visualizer(int[] arr){
        this.arr = arr;
        highLightIndx_1 = highLightIndx_2 = -1;
        delay = 20;        
    }
    
    public void setDelay(int miliSecond){
        this.delay = miliSecond;
    }

    public void setArr(int[] arr){
        this.arr = arr;
    }

    public void setComparedIndxes(int index1, int index2){
        highLightIndx_1 = index1;
        highLightIndx_2 = index2;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        int barWidth = width / arr.length;
        int maxHeight = getMaxHeight();
        for (int i = 0; i < arr.length; i++){
            int barHeight = (int) (((double) arr[i] / maxHeight) * height);
            int x = i * barWidth;
            int y = height - barHeight;

            if (i == highLightIndx_1 || i == highLightIndx_2) {
                g2d.setColor(Color.RED); // Highlight the two compared elements with red color
            } else {
                g2d.setColor(Color.BLUE); // Use blue color for other elements
            }

            g2d.fillRect(x, y, barWidth, barHeight);

            g2d.setColor(Color.BLACK);
            g2d.drawRect(x, y, barWidth, barHeight);
            
        }
    }

    public int getMaxHeight(){
        int maxHeight = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > maxHeight)
                maxHeight = arr[i];
        }
        return maxHeight;
    }

}
