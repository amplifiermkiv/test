package lt.andrej;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double x1 = 2;
        double y1 = 15;
        double x2 = 9;
        double y2 = 10;
        //

        double sDiff = pow((x2 - x1), 2);
        double yDiff = pow((y2 - y1), 2);

        double result = sqrt(sDiff + yDiff);
        System.out.println(result);

    }
}
