package Food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriver {
    private static Map<String, Processing> sklepy=new HashMap<>();
    static {
        sklepy.put("cebula",new ExtraFoodShop());
        sklepy.put("bez glutenu", new GlutenFreeShop());
        sklepy.put("miod", new HealthyShop());
    }

    OrderDto retive(String shopProduct, int productQuantity){
        OrderDto orderDto = new OrderDto(shopProduct,productQuantity);
        if(sklepy.containsKey(shopProduct.toLowerCase())){
            orderDto.setShop(sklepy.get(shopProduct));
        }
        return orderDto;

    }
}
