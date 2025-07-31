package Shipment;

public class TrackerOrder {
    private String orderid;
    private ShipMent shipment;
    private employee employee;  

    public TrackerOrder(String orderid, ShipMent shipment, employee employee) {
        this.orderid = orderid;
        this.shipment = shipment;
        this.employee = employee;
    }

    public void Deliveryshipment() {
        System.out.println("\nORDER ID: " + orderid);
        shipment.displayinfo();
        employee.display();
        System.out.println("Total Cost: " + shipment.calculatecharge());
    }

    public static void main(String[] args) {
        Manager m = new Manager("756", "Alamin", "Manager");
        Delivery d = new Delivery("515", "Showrab", "Delivery Agent");

        Domestic ds = new Domestic("361", 215.0, 1500.0, "Satkhira");
        International in = new International("649", 850.0, 700.0, "Dhaka");

        TrackerOrder t1 = new TrackerOrder("361", ds, m);
        TrackerOrder t2 = new TrackerOrder("649", in, d);

        t1.Deliveryshipment();
        t2.Deliveryshipment();
    }
}
