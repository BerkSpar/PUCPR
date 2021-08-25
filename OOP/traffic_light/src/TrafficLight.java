public class TrafficLight {
    /**
     * 0 - green
     * 1 - yellow
     * 2 - red
     */
    private static int color;

    public TrafficLight(){}

    public TrafficLight(int value) throws Exception {
        setColor(value);
    }

    public static void nextColor() {
        ++color;
        if(color == 3) color = 0;
    }

    public static void setColor(int value) throws Exception {
        if(value >= 0 && value <= 2) {
            color = value;
        } else {
            throw new Exception("Value needs is between 0 and 2");
        }
    }

    public static int getColor() {
        return color;
    }
}
