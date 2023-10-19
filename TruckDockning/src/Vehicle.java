public class Vehicle {

    private String vehicleTyp;
    private double vehicleWeight;

    private String kajar;
    public Vehicle(String vehicleTyp, double vehicleWeight){
        this.vehicleTyp=vehicleTyp;
        this.vehicleWeight=vehicleWeight;


    }
public Vehicle(String vehicleTyp){
        this.vehicleTyp=vehicleTyp;
}
    public void setVehicleTyp(String vehicleTyp) {
        this.vehicleTyp = vehicleTyp;
    }

    public double setVehicleWeight(double vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
        return vehicleWeight;
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

    public void navigatingToKaj(String kaj){
        kajar=kaj;


    }

    public String getKajar() {
        return kajar;
    }

    public void setKajar(String kajar) {
        this.kajar = kajar;
    }


}
