package Food2Door;

public class OrderDto {

    private String shopProduct;
    private int productQuantity;
    private Processing shop;

    public OrderDto(String shopProduct, int productQuantity) {
        this.shopProduct = shopProduct;
        this.productQuantity = productQuantity;
    }

    public String getShopProduct() {
        return shopProduct;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Processing getShop() {
        return shop;
    }

    public void setShop(Processing shop) {
        this.shop = shop;
    }
}
