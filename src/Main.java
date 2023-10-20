import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Vehicle> registreringAvSkapBilar= new ArrayList<>();
        Stationen stationen = new Stationen(registreringAvSkapBilar);
        stationen.dialogMedKunden();

    }
}