package KI35.Hotsii.Lab7;

/**
 * Class <code>ClothingShop</code> describes clothing shop
 */
public class ClothingShop implements Shop {
    private String name;
    private int shoesPrice;

    /**
     * Constructor
     * @param name - name value
     * @param price - price value
     */
    public ClothingShop(String name, int price) {
        this.name = name;
        this.shoesPrice = price;
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
    public void setShoesPrice(int price) {
        this.shoesPrice = price;
    }

    @Override
    public void print() {
        System.out.printf("Name: %s; Shoes price: %s;%n", name, shoesPrice);
    }

    @Override
    public int getPrice() {
        return shoesPrice;
    }

    @Override
    public int compareTo(Shop shop) {
        return shoesPrice - shop.getPrice();
    }
}
