package KI35.Hotsii.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Клас Lab2 реалізує приклад програми до лабораторної роботи №2
 * @author Hotsii Mykyta
 * @version 1.0
 * @since 1.0
 */
public class Main {
    private final static String FILE_PATH = "text.txt";

    /**
     * Статичний метод main є точкою входу в програму
     * @param args
     * @throws FileNotFoundException у випадку відстуності файлу за вказаною адресою.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new File(FILE_PATH));
        System.out.print("Enter the matrix size: ");
        int size = scanner.nextInt();
        System.out.print("Enter the placeholder character: ");
        char character = getPlaceholderCharacter();
        int half = size / 2;
        char[][] arr = new char[size][half];

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < half) arr[i][j] = character;
                if (i < half && j >= half || i >= half && j < half)
                    builder.append(String.format("%c\t", character));
                else
                    builder.append(" \t");
            }
            builder.append("\n");
        }

        writer.write(builder.toString());
        System.out.println(builder);
        System.out.println(Arrays.deepToString(arr));
        writer.close();
        scanner.close();
    }

    private static char getPlaceholderCharacter() {
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();
        if (character.length() != 1) {
            throw new IllegalArgumentException("Only one character must be entered");
        }
        return character.charAt(0);
    }
}
