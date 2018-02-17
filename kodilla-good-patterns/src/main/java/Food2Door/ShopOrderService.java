package Food2Door;

public class ShopOrderService {
    private ExtraFoodShop extraFoodShop;
    private HealthyShop healthyShop;
    private GlutenFreeShop glutenFreeShop;

    public ShopOrderService(final ExtraFoodShop extraFoodShop,
                               final HealthyShop healthyShop,
                               final GlutenFreeShop glutenFreeShop) {
        this.extraFoodShop = extraFoodShop;
        this.healthyShop = healthyShop;
        this.glutenFreeShop = glutenFreeShop;
    }

    public ShopDto process(final ShopOrder shopOrder) {
            return new ShopDto(shopOrder.getUser());
        }
    }
