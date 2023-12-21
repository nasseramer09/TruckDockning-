public class KajStatusKontroller{
    private boolean statusKollPaKajA= true;
    private boolean  statusKollPaKajB= true;
    private boolean statusKollPaKajC= true;
    private boolean  statusKollPaKajD = true;
    private boolean statusKollPaKajE = true;

    public void kontrolleraStatusPaKajar(Vehicle vehicle){
        if (vehicle.getVehicleTyp().equalsIgnoreCase("Skåpbil")){
            if(statusKollPaKajA){
                statusKollPaKajA=false;
                vehicle.setKajar("A");
                System.out.println("Skåpbilen har registererats och kan nu parkera vid kaj A");
            }
            else if(statusKollPaKajB){
                statusKollPaKajB=false;
                vehicle.setKajar("B");
                System.out.println("Skåpbilen har registererats och kan nu parkera vid kaj B");
            }
            else{
                System.out.println("Kaj A och B är upptagna förnarvarande\n välkomen åter senare");
            }
        }
        else if(vehicle.getVehicleTyp().equalsIgnoreCase("lätt lastbil") && vehicle.getVehicleWeight()<=5){
            if(statusKollPaKajA){
                statusKollPaKajA=false;
                vehicle.setKajar("A");
                System.out.println("Lätt lastbilen har registererats och kan nu parkera vid kaj A");
            }
            else if(vehicle.getVehicleTyp().equalsIgnoreCase("lätt lastbil") && vehicle.getVehicleWeight()>5 && vehicle.getVehicleWeight()<9){
                if(statusKollPaKajC){
                    statusKollPaKajC=false;
                    vehicle.setKajar("C");
                    System.out.println("Lätt lastbilen har registererats och kan nu parkera vid kaj C");
                }
                else if (statusKollPaKajD) {
                    statusKollPaKajD=false;
                    vehicle.setKajar("D");
                    System.out.println("Lätt lastbilen har registererats och kan nu parkera vid kaj D");

                }
            }
            else{
                System.out.println("Det är fullt upp på kaj A, C och D \n vänta kvar");
            }

         }
        else if(vehicle.getVehicleTyp().equalsIgnoreCase("tung lastbil") && vehicle.getVehicleWeight()<9){
            if (statusKollPaKajD){
                statusKollPaKajD=false;
                vehicle.setKajar("D");
                System.out.println("Lätt lastbilen har registererats och kan nu parkera vid kaj D");

            }
            else{
                System.out.println("Det är fullt upp på kaj D \n  vänta kvar");

            }
        }

        else if (vehicle.getVehicleTyp().equalsIgnoreCase("tung lastbil") && vehicle.getVehicleWeight()>=9) {
            if (statusKollPaKajE){
                statusKollPaKajE=false;
                vehicle.setKajar("E");
                System.out.println("Lätt lastbilen har registererats och kan nu parkera vid kaj E");

            }
            else{
                System.out.println("Just nu är kaj E upptagen \n välkommen åter");
            }
        }
}
}
