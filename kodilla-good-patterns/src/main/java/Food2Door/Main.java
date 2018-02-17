package Food2Door;

public class Main {

    public static void main(String[] args) {
        //Uzyskanie OrderDto na podstawie zamowienia
        OrderRetriver orderRetriver = new OrderRetriver();
        OrderDto order = orderRetriver.retive("miod",19);
        OrderDto order1 = orderRetriver.retive("cebula",9);
        OrderDto order2 = orderRetriver.retive("bez glutenu",20);
        //przekazanie OrderDto do przekazania(metoda process z klasy shopOrderService)
        ShopOrderService shopOrderService = new ShopOrderService(new ExtraFoodShop(),new HealthyShop(), new GlutenFreeShop());
        shopOrderService.process(order);
        shopOrderService.process(order1);
        shopOrderService.process(order2);

    }
}
