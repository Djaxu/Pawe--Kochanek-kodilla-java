package Food2Door;

public class OrderDto {

    private String shopProduct;
    private int productQuantity;

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
}
