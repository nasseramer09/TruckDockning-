public class Vehicle {

    private String vehicleTyp;
    private double vehicleWeight;

    private String kajar=null;
    public Vehicle(String vehicleTyp, double vehicleWeight){
        this.vehicleTyp=vehicleTyp;
        this.vehicleWeight=vehicleWeight;

    }


    public double getVehicleWeight() {
        return vehicleWeight;
    }

    public String getVehicleTyp() {
        return vehicleTyp;
    }

public boolean delningAvkajen(double vehicleWeight){
        return  false;

}


    public String getKajar() {
        return kajar;
    }

    public void setKajar(String kajar) {
        this.kajar = kajar;


    }


}
