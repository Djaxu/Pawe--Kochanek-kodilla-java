package Food2Door;



public class ShopOrder {

    public User user;
    public User shopProduct;
    public User productQuantity;

    public ShopOrder(User user, User shopProduct,User productQuantity) {
        this.user = user;
        this.shopProduct = shopProduct;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public User getShopProduct() {
        return shopProduct;
    }

    public User getProductQuantity() {
        return productQuantity;
    }
}
