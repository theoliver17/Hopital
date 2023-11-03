package TPJava;

import java.time.LocalDate;
import java.time.LocalTime;

public class RDV {

    private LocalDate Date;
    private LocalTime Hdebut;
    private LocalTime Hfin;
    private String patient;
    private String Docteur;

    public String rendezvous() {
        Date = LocalDate.now();
        this.Hdebut = LocalTime();
        this.Hfin = LocalTime();
        this.patient = patient;
        this.Docteur = Docteur;

        return ("Rendez-vous de " + patient + "le " + Date + "de " + Hdebut + "à " + Hfin + ". "
                + "Docteur en charge : " + Docteur);

    }

    private LocalTime LocalTime() {
        return null;
    }
}
