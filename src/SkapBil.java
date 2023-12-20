public class SkapBil extends Vehicle {

    private boolean statusKollPaKajA= true;
    private boolean  statusKollPaKajB= true;

    public SkapBil(String vehicleTyp, double vehicleWeight){
        super("Skåpbil", 3);
    }


    @Override
    public boolean delningAvkajen(double vehicleWeight){
        return super.delningAvkajen(vehicleWeight);
    }

    public void cheekControl(Vehicle vehicle){
        if (vehicle.getVehicleTyp().equalsIgnoreCase("Skåpbil")){
            if (statusKollPaKajA){
                statusKollPaKajA=false;
                vehicle.setKajar("A");
                System.out.println("Skåpbilen har registererats och kan nu parkera vid kaj A");
            } else if (statusKollPaKajB) {
                statusKollPaKajB=false;
                vehicle.setKajar("B");
                System.out.println("Skåpbilen har registererats och kan nu parkera vid kaj B");
            }else{
                System.out.println("Kaj A och B är upptagna förnarvarande\n välkomen åter senare");
            }
        }
    }




}
