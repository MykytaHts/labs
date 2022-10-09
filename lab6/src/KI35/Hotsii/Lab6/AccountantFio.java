package KI35.Hotsii.Lab6;

import java.io.*;

/**
 * Class <code>AccountantFio</code> implements method for tg(x)/ctg(x) expression
 * calculation
 * @author Mykyta Hotsii
 * @version 1.0
 */
public class AccountantFio {
    private double rad;
    private double result;
    private String BINARY_FILE_PATH;
    private String TXT_FILE_PATH;

    /**
     * Method writes the result to a binary file
     * @throws IOException
     */
    public void writeResBin() throws IOException{
        DataOutputStream output = new DataOutputStream(new FileOutputStream(BINARY_FILE_PATH));
        output.writeDouble(result);
        output.close();
    }

    /**
     * Method writes the result to a txt file
     * @throws IOException
     */
    public void writeResTxt() {
        try (PrintWriter writer = new PrintWriter(new File(TXT_FILE_PATH))) {
            writer.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method reads the result from a binary file
     * @throws IOException
     */
    public void readResBin() throws IOException {
        DataInputStream input = new DataInputStream(new FileInputStream(BINARY_FILE_PATH));
        result = input.readDouble();
        input.close();
    }

    /**
     * Method reads the result from a txt file
     * @throws IOException
     */
    public void readResTxt() {
        try (FileInputStream input = new FileInputStream(TXT_FILE_PATH);
             InputStreamReader inputStreamReader = new InputStreamReader(input);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            result = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method returns the result
     * @return
     */
    public double getResult() {
        return result;
    }

    /**
     * Method calculates the tg(x)/ctg(x) expression
     * @param x - angle in degrees
     * @throws CalcException
     */
    public void calculate(double x) throws CalcException{
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
    }

    public void setBinaryFilePath(String path) {
        BINARY_FILE_PATH = path;
    }

    public void setTxtFilePath(String path) {
        TXT_FILE_PATH = path;
    }
}
