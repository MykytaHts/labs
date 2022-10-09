package KI35.Hotsii.Lab7;

/**
 * Shop interface
 */
public interface Shop extends Comparable<Shop>{
    /**
     * Method prints object's data
     */
    void print();
    /**
     *
     * Method returns the price of the product
     */
    int getPrice();
}
