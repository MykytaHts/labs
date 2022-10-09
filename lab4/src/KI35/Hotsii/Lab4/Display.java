package KI35.Hotsii.Lab4;

import java.util.Objects;

import static KI35.Hotsii.Lab4.Resolution.*;
import static utils.Validator.validateRange;

/**
 * Class <code>Display</code> implements display.
 * @author Hotsii Mykyta
 */
public class Display {
    private Resolution resolution;
    private int scaleInPercent;

    /**
     * Constructor
     */
    public Display() {
        this.resolution = R1400x1050;
        this.scaleInPercent = 125;
    }

    /**
     * Constructor
     * @param resolution - resolution value
     * @param scaleInPercent - scale in percent value
     */
    public Display(Resolution resolution, int scaleInPercent) {
        this.resolution = resolution;
        this.scaleInPercent = scaleInPercent;
    }

    /**
     * Method return resolution value
     * @return resolution value
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * Method return scale value
     * @return scale value
     */
    public int getScale() {
        return scaleInPercent;
    }

    /**
     * Method sets scale in percent value
     * @param scaleInPercent - scale in percent value
     */
    public void setScale(int scaleInPercent) {
        validateRange(scaleInPercent);
        this.scaleInPercent = scaleInPercent;
    }

    /**
     * Method sets resolution
     * @param resolution - resolution value
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Display)) return false;
        Display display = (Display) o;
        return scaleInPercent == display.scaleInPercent &&
                resolution == display.resolution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolution, scaleInPercent);
    }

    @Override
    public String toString() {
        return "Display{" +
                "resolution=" + resolution +
                ", scaleInPercent=" + scaleInPercent +
                '}';
    }
}
