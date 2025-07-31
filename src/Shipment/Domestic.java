package Shipment;

public class Domestic extends ShipMent {
    private String region;

    public Domestic(String shipid, Double weight, Double charges, String region) {
        super(shipid, weight, charges);
        this.region = region;
    }

    public void displayinfo() {
        System.out.println("Domestic Shipment -> shipid: " + shipid + ", weight: " + weight + ", charge: " + charges + ", region: " + region);
    }

    public Double calculatecharge() {
        return charges * weight;
    }
}
