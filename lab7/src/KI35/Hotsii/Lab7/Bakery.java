package KI35.Hotsii.Lab7;

/**
 * Class <code>Bakery</code> describes Bakery
 */
public class Bakery implements Shop {
    private String name;
    private int productPrice;

    /**
     * Constructor
     * @param name - name value
     * @param price - price value
     */
    public Bakery(String name, int price) {
        this.name = name;
        this.productPrice = price;
    }

    /**
     * This method return name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets name
     * @param name - name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method sets price
     * @param price - name price
     */
    public void setProductPrice(int price) {
        this.productPrice = price;
    }

    @Override
    public void print() {
        System.out.printf("Name: %s; Product price: %s;%n", name, productPrice);
    }

    @Override
    public int getPrice() {
        return productPrice;
    }

    @Override
    public int compareTo(Shop shop) {
        return productPrice - shop.getPrice();
    }
}
