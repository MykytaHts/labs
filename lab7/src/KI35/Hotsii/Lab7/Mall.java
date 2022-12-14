package KI35.Hotsii.Lab7;

import java.util.ArrayList;
import java.util.List;

/**
 * Class <code>Mall</code> describes mall
 * @param <T>
 */
public class Mall<T extends Shop> {
    private final List<T> shops = new ArrayList<>();

    /**
     *
     * @param shop - shop
     */
    public void addShop(T shop) {
        shops.add(shop);
    }

    public int countClothingShops() {
        int clothingShopsCounter = 0;
        for (Shop shop : shops) {
            if (shop.getClass() == ClothingShop.class) {
                clothingShopsCounter++;
            }
        }
        return clothingShopsCounter;
    }

    public int countBakeries() {
        int bakeryCounter = 0;
        for (Shop shop : shops) {
            if (shop.getClass() == Bakery.class) {
                bakeryCounter++;
            }
        }
        return bakeryCounter;
    }

    /**
     *
     * @param index - index
     */
    public void deleteShop(int index) {
        shops.remove(index);
    }

    /**
     * This method returns shop with the highest price
     * @return <code>Shop</code>shop with the highest price
     */
    public T findMax() {
        if (shops.isEmpty()) return null;

        T shopWithHighestPrice = shops.get(0);
        for (T shop: shops) {
            if (shopWithHighestPrice.compareTo(shop) < 0) {
                shopWithHighestPrice = shop;
            }
        }

        return shopWithHighestPrice;
    }
}
