package Food2Door;

public class ShopDto {
    public String shopProduct;
    public int productQuantity;

    public ShopDto(String shopProduct, int productQuantity) {
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
