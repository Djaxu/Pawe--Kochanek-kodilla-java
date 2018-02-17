package Food2Door;

public class Main {

    public static void main(String[] args) {
        ShopOrderService orderService = new ShopOrderService(new ExtraFoodShop(),new HealthyShop(), new GlutenFreeShop());
        User user1 = new User("Sklep","Pomarancza", 50);
        orderService.process(new ShopOrder(user1,user1,user1));
    }
}
