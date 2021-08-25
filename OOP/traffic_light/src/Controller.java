public class Controller {

    public static void main(String[] args) throws Exception {
        System.out.println(TrafficLight.getColor());

        System.out.println();

        for(int i = 0; i < 10; i++) {
            TrafficLight.nextColor();
            System.out.println(TrafficLight.getColor());
        }

        System.out.println();

        TrafficLight.setColor(3);
        System.out.println(TrafficLight.getColor());
    }
}
