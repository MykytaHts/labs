package KI35.Hotsii.Lab3;

import static utils.Validator.*;

/**
 * Class <code>Corps</code> implements corps.
 * @author Hotsii Mykyta
 */
public class Corps {
    private String material;
    private int diagonalInInches;

    /**
     * Constructor
     */
    public Corps() {
        this.material = "plastic";
        this.diagonalInInches = 20;
    }

    /**
     * Constructor
     * @param width - width value
     * @param height - height value
     * @param material - material value
     * @param diagonalInInches - diagonalInInches value
     */
    public Corps(int width, int height, String material, int diagonalInInches) {
        validateRange(diagonalInInches);
        this.material = material;
        this.diagonalInInches = diagonalInInches;
    }

    /**
     * Method returns corps's material
     * @return Corps's material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Method returns corps's diagonalInInches
     * @return Corps's diagonalInInches
     */
    public int getDiagonalInInches() {
        return diagonalInInches;
    }

    /**
     * Method sets diagonalInInches value
     * @param diagonalInInches - diagonalInInches value
     */
    public void setDiagonalInInches(int diagonalInInches) {
        validateRange(diagonalInInches);
        this.diagonalInInches = diagonalInInches;
    }

    /**
     * Method sets material value
     * @param material - diagonalInInches value
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Corps{" +
                "material='" + material + '\'' +
                ", diagonalInInches=" + diagonalInInches +
                '}';
    }
}
