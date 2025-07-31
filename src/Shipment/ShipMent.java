package Shipment;

public abstract class ShipMent {
protected String shipid;
protected Double weight;
protected Double charges;
public ShipMent(String shipid, Double weight, Double charge){
    this.shipid=shipid;
    this.weight=weight;
    this.charges=charge;
}
public abstract Double calculatecharge();
 public abstract void displayinfo();

 
}
