public class Vehicle {

    private String vehicleTyp;
    private double vehicleWeight;


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

    public void navigatingToKaj(double vehicleWeight, String vehicleTyp){
        
        if (vehicleTyp.equalsIgnoreCase("skåpBil")){
            System.out.println(" Du kan parkera vid kaj A eller Kaj B");
        } else if (vehicleTyp.equalsIgnoreCase("Lätt LastBil") ) {
            if (vehicleWeight < 5) {
                System.out.println("Du kan parkera vid kajen A ");
            } else if (vehicleWeight>=5 && vehicleWeight <=9) {
                System.out.println("Du kan parkera vid kajen C eller D");
            }else {
                System.out.println("Fel inmatning ");
            }
        }  else if (vehicleTyp.equalsIgnoreCase("Tung LastBil")) {
            if (vehicleWeight<9){
                System.out.println("Du kan parkera vid kajen D");
            } else {
                System.out.println("Du kan parkera vi kajen E");
            }

        } else {
            System.out.println("Fel inmatning ");
        }

    }




}
