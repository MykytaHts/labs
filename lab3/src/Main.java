import KI35.Hotsii.Lab3.*;

import java.io.IOException;

/**
 * Monitor Application class implements main method for Monitor class possibilities demonstration
 * @author Mykyta Hotsii
 * @version 1.0
 */
public class Main {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Monitor monitor = new Monitor();
        Display display = new Display();
        display.setResolution(Resolution.R1400x1050);
        display.setScale(100);
        Corps corps = new Corps();
        corps.setDiagonalInInches(35);
        corps.setMaterial("iron");
        Controller controller = new Controller();
        controller.setAvailableLVDS(true);
        controller.setHeight(124);
        controller.setWidth(60);
        controller.setVoltage(16);
        monitor.addAdditionalDisplay(display);
        monitor.setController(controller);
        monitor.setCorps(corps);
        monitor.setManufacturer("Apple");
        monitor.removeAdditionalDisplay(display);
        monitor.dispose();
    }
}
