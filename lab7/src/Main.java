import KI35.Hotsii.Lab7.Bakery;
import KI35.Hotsii.Lab7.ClothingShop;
import KI35.Hotsii.Lab7.Mall;
import KI35.Hotsii.Lab7.Shop;

/**
 * Class <code>Accountant</code> Implements driver for Accountant class
 * @author Mykyta Hotsii
 * @version 1.0
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Mall<Shop> hdd = new Mall<>();
        hdd.addShop(new ClothingShop("Windows", 852124325));
        hdd.addShop(new ClothingShop("Weekend" , 32568741));
        hdd.addShop(new Bakery("People" , 2547814));
        hdd.addShop(new Bakery("People" , 2547814));
        hdd.addShop(new Bakery("JRE" , 67894257));
        System.out.println(hdd.countBakeries());
        System.out.println(hdd.countClothingShops());

    }
}
