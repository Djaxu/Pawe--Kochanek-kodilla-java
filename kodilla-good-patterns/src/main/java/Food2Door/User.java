package Food2Door;

public class User {

    private String shopName;
    private String shopProduct;
    private int productQuantity;

    public User(String userName, String userSurname,int productQuantity) {
        this.shopName = userName;
        this.shopProduct = userSurname;
        this.productQuantity = productQuantity;
    }

    public String getUserName() {
        return shopName;
    }

    public String getShopProduct() {
        return shopProduct;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
