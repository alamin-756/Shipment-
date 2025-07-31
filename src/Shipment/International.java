package Shipment;

public class International extends ShipMent {
    private String country;

    public International(String shipid, Double weight, Double charges, String country) {
        super(shipid, weight, charges);
        this.country = country;
    }

    public void displayinfo() {
        System.out.println("International Shipment -> shipid: " + shipid + ", weight: " + weight + ", charge: " + charges + ", country: " + country);
    }

    public Double calculatecharge() {
        return charges * weight;
    }
}
