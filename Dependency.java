public class Customer {
    private String id;
    private String name;

    public String getInfo(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Customer Id: " + id + " Name: " + name);
        return null;
    }
}

class Order {
    public String orderNo;
    private Customer customer1;

    public void placeOrder() {
        customer1 = new Customer(); // instance of OrderList class
        String info = customer1.getInfo("C101", "Sakib");
    }

    public static void main(String[] args) {
        Order o1 = new Order();
        o1.placeOrder();
    }
}
