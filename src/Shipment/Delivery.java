package Shipment;

public class Delivery extends employee {
    private String assign;

    public Delivery(String id, String name, String assign) {
        super(id, name);
        this.assign = assign;
    }

    public void display() {
        System.out.println("Delivery -> id: " + id + ", name: " + name + ", assign: " + assign);
    }
}
