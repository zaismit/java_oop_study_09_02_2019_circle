/**
 * Created by ZAISMIT - EVYNET
 **/
public class circle extends facade_file
{

    private static final double PI = 3.14;

    public static double length(double radius)
    {
        return 2 * PI * radius;
    }

    public static double circle_area(double radius)
    {
        return PI * radius * radius;
    }
}
