import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stationen {
private  List<Vehicle> registreringAvLastBilar;
public Stationen(List<Vehicle> registreringAvLastBilar){
    this.registreringAvLastBilar =registreringAvLastBilar;
}

public void dialogMedKunden(){

    Scanner input= new Scanner(System.in);
    List<Vehicle> registreringAvSkapBilar= new ArrayList<>();




    while (true){

        System.out.println("Välkomen till avlstningsstation Dumpa Mera\n" +
                "Följ instruktionerarna nedan\n" +
                "Tryck 1 för att se parkerade lastbilar\n" +
                "Tryck 2 för att registrera en ny avlastande lastbil\n" +
                "Tryck 3 för att avsluta proggrammet  ");
        int userInput= input.nextInt();
        if (userInput==3) {
            System.out.println("Programet avslutas här\n välkommen åter");
            break;

        }

        // implementing the logic av showing the trucks parked in station begins

        else if (userInput==1) {

            for (Vehicle parkeradeVehclar: registreringAvSkapBilar
            ) {
                System.out.println(" Här är de last bilar som är parkerade just nu " + parkeradeVehclar.getVehicleTyp()+" "  + parkeradeVehclar.getVehicleWeight() + " Ton " );
            }

        }

        // End of the implementation av the logic
        // implementing the logic av registering a truck to the station system begins
        else if (userInput==2){

            System.out.println("Registerera en ny lastbil \n" +
                    "Följ instruktionerarna nedan\n" +
                    "Tryck 1 för skåpbil\n" +
                    "Tryck 2 för lätt lastbil\n" +
                    "Tryck 3 för tung lastbil" );

            int newInput =input.nextInt();
            if (newInput==1){
                if (registreringAvSkapBilar.size()<5){

                    String vehicleTyp="skåpBil";

                    SkapBil skapBil = new SkapBil(vehicleTyp,0);
                    double skapBilWeight = skapBil.getVehicleWeight();
                    registreringAvSkapBilar.add(skapBil);
                    for (Vehicle vehicleSkapBil: registreringAvSkapBilar
                    ) {
                        System.out.println("Lastbilen av typen " + vehicleSkapBil.getVehicleTyp() + "som väger " + vehicleSkapBil.getVehicleWeight() + "har nu registererats");
                            skapBil.navigatingToKaj(skapBilWeight, vehicleTyp);
                    }
                } else {
                    System.out.println("Det är fullt upp just nu i kajarna \n vänta tills någon av kajen är lediga");
                }

// Problemmet med att det vissas bara en skåpbil sparad i listan är att det skapas en nu list varje gång
                //skapBil.addSkapBilTillListan(skapBil);
                //skapBil.getSkapBilarIListan();


            } else if (newInput==2) {
                if (registreringAvSkapBilar.size()<5){

                    String vehicleTyp="Lätt Lastbil";
                    System.out.println("Skriv in hur mycket lätt lastbilen väger i ton ");
                    double vehicleWeight= input.nextDouble();
                    LattLastBil lattLastBil = new LattLastBil(vehicleTyp,vehicleWeight);
                    registreringAvSkapBilar.add(lattLastBil);
                lattLastBil.navigatingToKaj(vehicleWeight, vehicleTyp);
                } else {
                    System.out.println("Det är fullt upp just nu i kajarna  \n vänta tills någon av kajen är lediga");
                }

            }else if(newInput==3){
                if (registreringAvSkapBilar.size()<5){

                    String vehicleTyp="Tung Lastbil";
                    System.out.println("Skriv in hur mycket lätt lastbilen väger i ton ");
                    double vehicleWeight= input.nextDouble();
                    TungLastBil tungLastBil = new TungLastBil(vehicleTyp,vehicleWeight);
                    registreringAvSkapBilar.add(tungLastBil);
                 tungLastBil.navigatingToKaj(vehicleWeight, vehicleTyp);
                } else {
                    System.out.println("Det är fullt upp just nu i kajarna \n vänta tills någon av kajen är lediga");
                }            }else {
                System.out.println("Fel inmatning \n Var god och följ instruktionerna nedean");

            }


        } // End of the implementing of the logic


    }
}
}
