package KI35.Hotsii.Lab5;

/**
 * Class <code>Accountant</code> implements method for tg(x)/ctg(x) expression
 * calculation
 * @author Mykyta Hotsii
 * @version 1.0
 */
public class Accountant {
    private double rad;

    /**
     * Method calculates the tg(x)/ctg(x) expression
     * @param x - angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException{
        double result;
        try {
            rad = x * Math.PI / 180;
            result = Math.pow(Math.tan(rad), 2);

            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {

                if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                    throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
                else if (x==0)
                    throw new CalcException("Exception reason: X = 0");
                else
                    throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return result;
    }
}
