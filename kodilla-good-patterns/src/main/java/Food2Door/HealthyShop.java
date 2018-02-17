package Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Processing {

    public boolean process(ShopDto shopDto){
        System.out.println("Healthy Shop order : ");
        if(products.containsKey(shopDto.shopProduct.toLowerCase())){
            if(products.get(shopDto.shopProduct.toLowerCase())>=shopDto.productQuantity){
                int quantity=products.get(shopDto.shopProduct.toLowerCase());
                products.put(shopDto.shopProduct.toLowerCase(),quantity-shopDto.productQuantity);
                System.out.println("Zrealizowane zamowinie " + shopDto.shopProduct+ " " + shopDto.productQuantity);
                return true;
            }
            System.out.println("Brak wystarczajacej ilosci towaru ");
            return false;
        }
        System.out.println("Brak produktu w sklepie ");
        return false;
    }
    private static Map<String , Integer> products = new HashMap<>();
    static {
        products.put("miod",100);
        products.put("laptop", 4);
    }
}
