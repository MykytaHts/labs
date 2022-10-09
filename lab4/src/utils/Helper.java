package utils;

import java.io.*;

public class Helper {
    public static PrintWriter getWriter(String path) {
        try {
            return new PrintWriter(new FileWriter(path), true);
        } catch (IOException e) {
            throw new IllegalArgumentException("There's no file with such path");
        }
    }
}
