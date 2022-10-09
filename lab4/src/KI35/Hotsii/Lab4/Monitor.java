package KI35.Hotsii.Lab4;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utils.Helper.getWriter;
import static utils.Validator.validateObjectValues;
import static utils.Validator.validateStringValue;

/**
 * Class <code>Monitor</code> implements monitor.
 * @author Hotsii Mykyta
 */
public class Monitor {
    private Controller controller;
    private Corps corps;
    private String manufacturer;
    private Display mainDisplay;
    private final List<Display> additionalDisplays = new ArrayList<>();
    private final PrintWriter fileWriter = getWriter("text.txt");
    protected boolean turnedOn;

    /**
     * Constructor
     */
    public Monitor() {
        this.controller = new Controller();
        this.mainDisplay = new Display();
        this.corps = new Corps();
        this.manufacturer = "Sumsung";
        fileWriter.printf("Monitor is created. %n{%n%s%n}%n%n", this);
    }

    /**
     * Constructor
     * @param controller - controller
     * @param mainDisplay - main display
     * @param corps - corps
     * @param manufacturer - manufacturer
     */
    public Monitor(Controller controller, Display mainDisplay, Corps corps, String manufacturer) {
        validateStringValue(manufacturer);
        this.controller = controller;
        this.mainDisplay = mainDisplay;
        this.corps = corps;
        this.manufacturer = manufacturer;
        fileWriter.printf("Monitor is created. %n{%n%s%n}%n%n", this);
    }

    /**
     * Method returns controller
     * @return controller
     */
    public Controller getController() {
        return controller;
    }

    /**
     * Method returns main display
     * @return main display
     */
    public Display getMainDisplay() {
        return mainDisplay;
    }

    /**
     * Method returns main corps
     * @return corps
     */
    public Corps getCorps() {
        return corps;
    }

    /**
     * Method returns manufacturer
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Method returns additional display
     * @return additional display
     */
    public List<Display> getAdditionalDisplays() {
        return Collections.unmodifiableList(additionalDisplays);
    }

    /**
     * Method adds additional display
     * @param display - display
     */
    public void addAdditionalDisplay(Display display) {
        validateObjectValues(display);
        if (display == mainDisplay)
            throw new IllegalArgumentException("This display is already set as the main display");
        additionalDisplays.add(display);
        fileWriter.printf("Added additional display. %n{%n%s%n}%n%n", display);
    }

    /**
     * Method removes additional display
     * @param display - display
     */
    public void removeAdditionalDisplay(Display display) {
        validateObjectValues(display);
        additionalDisplays.remove(display);
        fileWriter.printf("Deleted additional display. %n{%n%s%n}%n%n", display);
    }

    /**
     * Method sets controller
     * @param controller - controller
     */
    public void setController(Controller controller) {
        validateObjectValues(controller);
        this.controller = controller;
        fileWriter.printf("The controller has been changed. %n{%n%s%n}%n%n", controller);
    }

    /**
     * Method sets main display
     * @param mainDisplay - main display
     */
    public void setMainDisplay(Display mainDisplay) {
        validateObjectValues(mainDisplay);
        if (additionalDisplays.contains(mainDisplay))
            throw new IllegalArgumentException("This display is already set as the additional display");
        this.mainDisplay = mainDisplay;
        fileWriter.printf("The main display has been changed. %n{%n%s%n}%n%n", mainDisplay);
    }

    /**
     * Method sets corps
     * @param corps - corps
     */
    public void setCorps(Corps corps) {
        validateObjectValues(corps);
        this.corps = corps;
        fileWriter.printf("The corps has been changed. %n{%n%s%n}%n%n", corps);
    }

    /**
     * Method sets manufacturer
     * @param manufacturer - manufacturer
     */
    public void setManufacturer(String manufacturer) {
        validateStringValue(manufacturer);
        this.manufacturer = manufacturer;
        fileWriter.printf("The manufacturer has been changed. %n{%n%s%n}%n%n", manufacturer);
    }

    /**
     * Method closes resources
     */
    public void dispose()
    {
        fileWriter.close();
    }

    public void turnOnScreen() {
        this.turnedOn = true;
        System.out.println("Turn on the screen.");
    }

    public void turnOfScreen() {
        this.turnedOn = false;
        System.out.println("Turn of the screen.");
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "controller=" + controller +
                ", corps=" + corps +
                ", manufacturer='" + manufacturer + '\'' +
                ", mainDisplay=" + mainDisplay +
                ", additionalDisplays=" + additionalDisplays +
                ", fileWriter=" + fileWriter +
                '}';
    }
}
