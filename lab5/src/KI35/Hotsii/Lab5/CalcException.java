package KI35.Hotsii.Lab5;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author Mykyta Hotsii
 * @version 1.0
 */
public class CalcException extends ArithmeticException{

    public CalcException() {}

    public CalcException(String message) {
        super(message);
    }
}
