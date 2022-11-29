package KI35.Hotsii.Lab4;

import java.util.function.Consumer;

public class SensorScreen extends Monitor implements Sensorable {
    /**
     * Constructor
     */
    public SensorScreen() {
    }

    /**
     * Constructor
     * @param controller - controller
     * @param mainDisplay - main display
     * @param corps - corps
     * @param manufacturer - manufacturer
     */
    public SensorScreen(Controller controller, Display mainDisplay, Corps corps, String manufacturer) {
        super(controller, mainDisplay, corps, manufacturer);
    }

    @Override
    public void hold() {
        executeIfTurnedOn(System.out::println, "User is holding his finger.");
    }

    @Override
    public void scroll() {
        executeIfTurnedOn(System.out::println, "User swipe his finger down from top to bottom.");
    }

    @Override
    public void touch() {
        executeIfTurnedOn(System.out::println, "User touched the screen.");
    }

    private void executeIfTurnedOn(Consumer<String> consumer, String value) {
        if (turnedOn) {
            consumer.accept(value);
        } else {
            System.out.println("The screen is off.");
        }
    }
}
