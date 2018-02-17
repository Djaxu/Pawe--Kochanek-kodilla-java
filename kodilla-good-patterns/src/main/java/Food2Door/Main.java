package Food2Door;

public class Main {

    public static void main(String[] args) {
        ShopOrderService orderService = new ShopOrderService(new ExtraFoodShop(new OrderDto("Cebula",15)),new HealthyShop(),new GlutenFreeShop());
        User user = new User("SADAS","asda",4);
        orderService.process(new ShopOrder(user,user,user));
    }
}
