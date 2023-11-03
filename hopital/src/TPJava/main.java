package TPJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static List<patients> list_patient = new ArrayList<>();
    private static List<Personnel> list_personnel = new ArrayList<>();
    private static List<RDV> list_RDV = new ArrayList<>();

    public static void AfficherListMedecins() {
        for (int i = 0; i < list_personnel.size(); i++) {
            System.out.println(i + " | " + list_personnel.get(i).getDocPrenom() + " " +
                    list_personnel.get(i).getDocNom());
        }
    }

    public static void AfficherListPatients() {
        for (int i = 0; i < list_patient.size(); i++) {
            System.out.println(i + " | " + list_patient.get(i).getPrenom() + " " +
                    list_patient.get(i).getNom());
        }
    }

    public static void AfficherListeRDV() {
    }

    public static void AddPatient(Scanner sc) {
        System.out.println("Nom du patient ? ");
        String nom = sc.next();

        System.out.println("Prénom du patient ? ");
        String prenom = sc.next();

        System.out.println("Jour de naissance");
        int jour = sc.nextInt();

        System.out.println("Mois de naissance ");
        int mois = sc.nextInt();

        System.out.println("Année de naissance ");
        int année = sc.nextInt();

        System.out.println("Adresse du patient ? ");
        String adresse = sc.next();

        System.out.println("Numéro de téléphone du patient ? ");
        String numtel = sc.next();

        patients patient = new patients(nom, prenom, jour, mois, année, adresse, numtel);

        list_patient.add(patient);

        System.out.println(patient);
    }

    public static void main(String[] args) {

        Personnel doc1 = new Personnel("Oliver", "Théo", "Neurologue", 12, 11, 2009, " lotissement ta mère",
                06060606060,
                6);
        Personnel doc2 = new Personnel("Lagardenationnale", "Samuelle", "Cardiologue", 19, 9, 2019,
                " avenue marie curry ", 0634542332, 1);
        Personnel doc3 = new Personnel("Cabau", "Théo", "Gynécoloque", 27, 3, 2015, " comissariat", 0601010101,
                4);

        list_personnel.add(doc1);
        list_personnel.add(doc2);
        list_personnel.add(doc3);

        Scanner sc = new Scanner(System.in);
        {
            while (true)

            {
                System.out.println("Que voulez vous faire ?");
                System.out.println("1 : Afficher la liste des médecins et leur expérience");
                System.out.println("2 : Ajouter un patient ");
                System.out.println("3 : Afficher la liste des rendez-vous d'un médecin");
                System.out.println("4 : Afficher la liste des patients");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        AfficherListMedecins();
                        break;

                    case 2:
                        AddPatient(sc);
                        break;

                    case 3:
                        AfficherListeRDV();
                        break;

                    case 4:
                        AfficherListPatients();
                        break;

                    default:
                        System.out.println("Inconnu");
                }

            }
        }
    }
}