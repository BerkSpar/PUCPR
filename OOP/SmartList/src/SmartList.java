import java.util.ArrayList;

public class SmartList {
    private double[] list;
    private int currentIndex = 0;

    public SmartList(int value) {
        list = new double[value];
    }

    public void add(double value) {
        list[currentIndex] = value;
        currentIndex++;
    }

    public int length() {
        return currentIndex;
    }

    public double getAt(int index) {
        if(index >= currentIndex) {
            System.out.println("Invalid index");
            return 0;
        } else {
            return list[index];
        }
    }

    public void setAt(int index, double value) {
        list[index] = value;
    }

    public void clean() {
        list = null;
    }
}
