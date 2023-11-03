package TPJava;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Personnel {

    private String DocNom;
    private String DocPrenom;
    private String DocSpe;
    private LocalDate DocDate;
    private int DocExp;

    public Personnel(String nom, String prenom, String specialite, int jour, int mois, int année, String adresse,
            int i, int exp) {
        this.DocNom = nom;
        this.DocPrenom = prenom;
        this.DocSpe = specialite;
        DocDate = LocalDate.of(année, mois, jour);
        this.DocExp = exp;

    }

    public String expericence() {
        Period exp = Period.between(DocDate, LocalDate.now());
        int years = exp.getYears();
        int months = exp.getMonths();
        int days = exp.getDays();
        return ("et possède " + years + "ans, " + months + " mois et " + days + " jours d'expérience.");
    }

    public String toString() {
        return "Docteur " + DocNom + " " + DocPrenom + " spécialiste en " + DocSpe + " diplômé le " + DocDate
                + expericence();
    }

    public String getDocNom() {
        return this.DocNom;
    }

    public void setDocNom(String DocNom) {
        this.DocNom = DocNom;
    }

    public String getDocPrenom() {
        return this.DocPrenom;
    }

    public void setDocPrenom(String DocPrenom) {
        this.DocPrenom = DocPrenom;
    }

    public String getDocSpe() {
        return this.DocSpe;
    }

    public void setDocSpe(String DocSpe) {
        this.DocSpe = DocSpe;
    }

    public LocalDate getDocDate() {
        return this.DocDate;
    }

    public void setDocDate(LocalDate DocDate) {
        this.DocDate = DocDate;
    }

    public int getDocExp() {
        return this.DocExp;
    }

    public void setDocExp(int DocExp) {
        this.DocExp = DocExp;
    }

}
