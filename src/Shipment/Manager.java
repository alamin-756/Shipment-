package Shipment;

public class Manager extends employee {
    private String role;

    public Manager(String id, String name, String role) {
        super(id, name);
        this.role = role;
    }


}
