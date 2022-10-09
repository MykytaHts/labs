package KI35.Hotsii.Lab3;

import static utils.Validator.validateRange;

/**
 * Class <code>Controller</code> implements controller.
 * @author Hotsii Mykyta
 */
public class Controller {
    private int voltage;
    private int width;
    private int height;
    private boolean availableLVDS;

    /**
     * Constructor
     */
    public Controller() {
        this.availableLVDS = true;
        this.width = 140;
        this.height = 60;
        this.voltage = 12;
    }

    /**
     * Constructor
     * @param width - width value
     * @param height - height value
     * @param voltage - voltage value
     */
    public Controller(int width, int height, int voltage) {
        validateRange(width, height, voltage);
        this.width = width;
        this.height = height;
        this.voltage = voltage;
    }

    /**
     * Method sets voltage value
     * @param voltage - voltage value
     */
    public void setVoltage(int voltage) {
        validateRange(voltage);
        this.voltage = voltage;
    }

    /**
     * Method sets width value
     * @param width - width value
     */
    public void setWidth(int width) {
        validateRange(voltage);
        this.width = width;
    }

    /**
     * Method sets height value
     * @param height - height value
     */
    public void setHeight(int height) {
        validateRange(voltage);
        this.height = height;
    }

    /**
     * Method sets is availableLVDS available
     * @param availableLVDS - is availableLVDS available
     */
    public void setAvailableLVDS(boolean availableLVDS) {
        this.availableLVDS = availableLVDS;
    }

    /**
     * Method returns controller's voltage
     * @return Controller's voltage
     */
    public int getVoltage() {
        return voltage;
    }

    /**
     * Method returns controller's width
     * @return Controller's width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Method returns controller's height
     * @return Controller's height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Method returns boolean value that describes the ability of the LVDC to use
     * @return Controller's height
     */
    public boolean isAvailableLVDS() {
        return availableLVDS;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "voltage=" + voltage +
                ", width=" + width +
                ", height=" + height +
                ", availableLVDS=" + availableLVDS +
                '}';
    }
}
