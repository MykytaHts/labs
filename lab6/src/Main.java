import KI35.Hotsii.Lab6.AccountantFio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
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
        RandomAccessFile file = new RandomAccessFile(new File("text.txt"), "rw");
        file.writeChars("hello");
        file.close();
    }
}
