public class Product {
    private String itemNo; // it usually alphanumeric
    private String name;
    private double price;
    private int quantity;

    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // item number should be unique so i couldn't set it as i want
    // public void setItemNo(String number) {
    //     itemNo = number;
    // }

    // name also should be unique
    // public void setName(String nameStr) {
    //     name = nameStr; // oh this is why they use this keyword, if i pass the same name as the parameter, it will be ambiguous
    // }

    public void setPrice(int rupiah) {
        price = rupiah;
    }

    public void setQuantity(int qty) {
        quantity = qty;
    }
}
