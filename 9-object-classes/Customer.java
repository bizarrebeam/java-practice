public class Customer {
    private String custId;
    private String name;
    private String address;
    private String phone;

    public Customer(String id, String nm, String addr, String ph) {
        custId = id;
        name = nm;
        address = addr;
        phone = ph;
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    // inget setter tetep punya parameter
    public void setAddress(String addr) {
        address = addr;
    }

    public void setPhone(String ph) {
        phone = ph;
    }

}
