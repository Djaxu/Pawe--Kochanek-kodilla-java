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

    public boolean process(final OrderDto orderDto) {
        if (orderDto.getShop()==null){
            System.out.println("nie znalezionio opdpowiedniego sklepu");
            return false;
        }
            return orderDto.getShop().process(new ShopDto(orderDto.getShopProduct(),orderDto.getProductQuantity()));

        }
    }
