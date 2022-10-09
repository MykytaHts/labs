import KI35.Hotsii.Lab6.AccountantFio;

import java.io.IOException;
import java.util.Scanner;

/**
 * Class <code>Accountant</code> Implements driver for Accountant class
 * @author Mykyta Hotsii
 * @version 1.0
 */
public class Main {
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        AccountantFio fio = new AccountantFio();
        fio.setBinaryFilePath("binary.bin");
        fio.setTxtFilePath("text.txt");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        fio.calculate(data);
        System.out.println("Result is: " + fio.getResult());
        fio.writeResTxt();
        fio.writeResBin();
        fio.readResBin();
        System.out.println("Result is: " + fio.getResult());
        fio.readResTxt();
        System.out.println("Result is: " + fio.getResult());

    }
}
