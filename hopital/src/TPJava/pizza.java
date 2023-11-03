package TPJava;

import java.util.ArrayList;
import java.util.List;

public class pizza {

    private String nom;
    private taille_pizza taille;
    private float prix;

    private static List<pizza> list_pizza = new ArrayList<>();

    public pizza(String nom, float prix) {
        this.nom = nom;
        this.taille = taille;
        this.prix = prix;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public taille_pizza getTaille() {
        return this.taille;
    }

    public void setTaille(taille_pizza taille) {
        this.taille = taille;
    }

    public float getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Pizza" + nom + ", taille " + taille + " prix :" + prix;
    }

}
