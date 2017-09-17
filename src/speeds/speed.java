package speeds;

public class speed {

    public static void main(String[] args) {

        double distance = 14.0 / 1.6;
        double time = ((45.0 * 60.0) + 30.0) / 3600.0;
        double speed = distance / time;

        System.out.println("the avg speed is " + speed);


    }
}
