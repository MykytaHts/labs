package utils;

public class Validator {
    public static void validateRange(int... values) {
        for (int field: values) {
            if (field <= 0)
                throw new IllegalStateException("Value must be greater than zero.");
        }
    }

    public static void validateObjectValues(Object... objects) {
        for (Object object: objects) {
            if (object == null)
                throw new IllegalStateException("Object value can't be null.");
        }
    }

    public static void validateStringValue(String value) {
        if (value == null || value.isEmpty())
            throw new IllegalStateException("String value can't be empty or null.");
    }
}
