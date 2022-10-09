package KI35.Hotsii.Lab4;

/**
 * Interface for sensor tech
 */
public interface Sensorable {
    /**
     * This method is called when user holds his finger on the screen
     */
    void hold();
    /**
     * This method is called when user swipes his finger down from top to bottom
     */
    void scroll();
    /**
     * This method is called when user touches the screen.
     */
    void touch();
}
