package Food2Door;

public class ExtraFoodShop implements Processing {

   public boolean process(){
        System.out.println("Extra Food Shop order : ");
        return true;
    }
    OrderDto orderDto= new OrderDto("cebula",4);

    public ExtraFoodShop(OrderDto orderDto) {
       this.orderDto=orderDto;
    }

}
