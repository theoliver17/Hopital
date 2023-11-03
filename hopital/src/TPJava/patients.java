package TPJava;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class patients {

    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private String adresse;
    private String numtel;

    public patients(String nom, String prenom, int jour, int mois, int année, String adresse, String numtel) {
        this.nom = nom;
        this.prenom = prenom;
        date_naissance = LocalDate.of(année, mois, jour);
        this.adresse = adresse;
        this.numtel = numtel;

    }

    // public patients(String nom2, String prenom2, String date_naissance2, String
    // adresse2, String numtel2) {
    // }

    public int age() {

        return Period.between(date_naissance, LocalDate.now()).getYears();
    }

    public String toString() {
        return "Patient: " + nom + " " + prenom + " age:" + age() + " à " + adresse + "disponnible au " + numtel;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumtel() {
        return this.numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

}
