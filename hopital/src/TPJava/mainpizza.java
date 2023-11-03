package TPJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainpizza {
    private static List<ingredients> list_ingredients = new ArrayList<>();

    public static void Afficheringredients() {
        for (int i = 0; i < list_ingredients.size(); i++) {
            System.out.println(i + " | " + list_ingredients.get(i).getIngredient1());
        }
    }

    public static void AddIngredients(Scanner sc) {

        System.out.println("Ingrédient à ajouter : ");
        String igr = sc.next();

        System.out.println("Type (millilitre , gramme, unitaire) : ");
        String typeStr = sc.next();

        type_ingredients type = null;
        switch (typeStr) {
            case "gramme":
                type = type_ingredients.grammes;
                break;

        }

        type_ingredients typex = null;
        switch (typeStr) {
            case "unitaires":
                type = type_ingredients.unitaires;
                break;

        }

        type_ingredients typeend = null;
        switch (typeStr) {
            case "millilitre":
                type = type_ingredients.millilitres;
                break;

        }

        System.out.println("Prix : ");
        float prix = sc.nextInt();

        ingredients ingredient = new ingredients(igr, type, prix);

        list_ingredients.add(ingredient);

        System.out.println(ingredient);
    }

    private static List<pizza> list_pizza = new ArrayList<>();

    public static void Afficherpizza() {
        for (int i = 0; i < list_pizza.size(); i++) {
            System.out.println(i + " | " + list_pizza.get(i).getNom());
        }

        pizza pizza1 = new pizza("Margareta", 11.95f);
        pizza pizza2 = new pizza("Royale", 13.95f);
        pizza pizza3 = new pizza("Reine", 13.95f);
        pizza pizza4 = new pizza("Blanche", 12.95f);
        pizza pizza5 = new pizza("Flamkuche", 11.95f);

        list_pizza.add(pizza1);
        list_pizza.add(pizza2);
        list_pizza.add(pizza3);
        list_pizza.add(pizza4);
        list_pizza.add(pizza5);

    }

    public static String AjouterIngredientPizza() {
        System.out.println("Que voulez-vous ajouter ? ");

        System.out.println("Sur quelle pizza ? ");

        return null;
    }

    public static void main(String[] args) {

        ingredients ingredient1 = new ingredients("Chorizzo", type_ingredients.grammes, 0.27f);
        ingredients ingredient2 = new ingredients("Frommage de chèvre", type_ingredients.unitaires, 2.44f);
        ingredients ingredient3 = new ingredients("Oeufs", type_ingredients.unitaires, 0.20f);
        ingredients ingredient4 = new ingredients("Basilic", type_ingredients.grammes, 0.035f);
        ingredients ingredient5 = new ingredients("Poivrons", type_ingredients.unitaires, 1);

        list_ingredients.add(ingredient1);
        list_ingredients.add(ingredient2);
        list_ingredients.add(ingredient3);
        list_ingredients.add(ingredient4);
        list_ingredients.add(ingredient5);

        Scanner sc = new Scanner(System.in);
        {

            {
                System.out.println("Que voulez vous faire ?");
                System.out.println("1 : Afficher la liste des ingrédients");
                System.out.println("2 : Créer un ingrédient ");
                System.out.println("3 : Ajouter une pizza");
                System.out.println("4 : Ajouter ingrédient");
                System.out.println("5 : Voir les pizzas");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        Afficheringredients();
                        break;

                    case 2:
                        AddIngredients(sc);
                        break;

                    // case 3:
                    // Addpizza();
                    // break;

                    case 4:
                        AjouterIngredientPizza();
                        break;

                    case 5:
                        Afficherpizza();
                        break;

                    default:
                        System.out.println("Veuillez choisir entre l'option 1 et 5");
                }

            }
        }
    }
}