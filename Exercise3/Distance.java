import java.lang.Math;
public class Distance
{

    public double distance(double x1, double y1, double x2, double y2)
    {
        double result = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return result;
    }

    public static void main(String[] args)
    {   Distance obj = new Distance();
        System.out.println(obj.distance(0, 0, 4, 5));

    }

}