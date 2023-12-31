import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stationen{
    private  List<Vehicle> registreringAvLastBilar;

    public Stationen(List<Vehicle> registreringAvLastBilar){
        this.registreringAvLastBilar = registreringAvLastBilar;
    }
    public void dialogMedKunden(){

    Scanner input= new Scanner(System.in);
    List<Vehicle> registreringAvSkapBilar= new ArrayList<>();
    KajStatusKontroller kajStatusKontroller= new KajStatusKontroller();

    while (true){

        System.out.println("""
                Välkomen till avlstningsstation Dumpa Mera
                 Följ instruktionerarna nedan
                 Tryck 1 för att se parkerade lastbilar
                 Tryck 2 för att registrera en ny avlastande lastbil
                 Tryck 3 för att avsluta proggrammet \s""");

        int userInput= input.nextInt();
        switch (userInput){
            case 1:
                if (registreringAvSkapBilar.isEmpty()){
                    System.out.println("Just nu finns det inga bilar parkerad ");
                }
                else{
                    for (Vehicle parkeradeVehclar: registreringAvSkapBilar){
                        String kaj = parkeradeVehclar.getKajar();
                        System.out.println(" Här är de last bilar som är parkerade just nu " + parkeradeVehclar.getVehicleTyp()+" "
                                + parkeradeVehclar.getVehicleWeight() + " Ton i kaj " + kaj  );
                    }
                }
                break;
            case 2:
                System.out.println("Registerera en ny lastbil \n " +
                        "Följ instruktionerarna nedan\n " +
                        "Tryck 1 för skåpbil\n " +
                        "Tryck 2 för lätt lastbil\n " +
                        "Tryck 3 för tung lastbil" );

                int newInput =input.nextInt();
                switch (newInput){
                    case 1:
                            if (registreringAvSkapBilar.size()<5){
                            String vehicleTyp="skåpBil";
                            SkapBil skapBil = new SkapBil(vehicleTyp,0);
                            registreringAvSkapBilar.add(skapBil);
                            kajStatusKontroller.kontrolleraStatusPaKajar(skapBil);
                        }
                        else{
                            System.out.println("Det är fullt upp just nu i Dumpa mera \n Besök Dumpa mest stationen ");
                        }
                        break;
                    case 2:
                        if (registreringAvSkapBilar.size()<5){

                            String vehicleTyp="Lätt Lastbil";
                            System.out.println("Skriv in hur mycket lätt lastbilen väger i ton ");
                            double vehicleWeight= input.nextDouble();
                            LattLastBil lattLastBil = new LattLastBil(vehicleTyp,vehicleWeight);
                            registreringAvSkapBilar.add(lattLastBil);
                            kajStatusKontroller.kontrolleraStatusPaKajar(lattLastBil);

                        }
                        else{
                            System.out.println("Det är fullt upp just nu i kajarna  \n vänta tills någon av kajen är lediga");
                        }
                        break;

                    case 3:
                        if(registreringAvSkapBilar.size()<5){

                        String vehicleTyp="Tung Lastbil";
                        System.out.println("Skriv in hur mycket lätt lastbilen väger i ton ");
                        double vehicleWeight= input.nextDouble();
                        TungLastBil tungLastBil = new TungLastBil(vehicleTyp,vehicleWeight);
                        registreringAvSkapBilar.add(tungLastBil);
                        kajStatusKontroller.kontrolleraStatusPaKajar(tungLastBil);

                    }
                    else{
                        System.out.println("Kajarna är upptagna just nu \n vänta tills någon  kaj är ledig");
                    }
                         break;
                    default:  System.out.println("Fel inmatning \n Var god och följ instruktionerna nedean");
                         break;

                }
              break;
            case 3: System.out.println("Programet avslutas här\n välkommen åter");
                     break;
        }

      }



}
}
