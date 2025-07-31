package Shipment;

public abstract class employee {
    protected String id;
    protected String name;

    public employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void display();
}
