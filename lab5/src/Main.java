import KI35.Hotsii.Lab5.Accountant;
import KI35.Hotsii.Lab5.CalcException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class <code>Accountant</code> Implements driver for Accountant class
 * @author Mykyta Hotsii
 * @version 1.0
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        try
        {
            
            System.out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try
            {
                try
                {
                    Accountant eq = new Accountant();
                    System.out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                }
                finally
                {
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
                System.out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {

            System.out.print("Exception reason: Perhaps wrong file path");
        }
    }
}
