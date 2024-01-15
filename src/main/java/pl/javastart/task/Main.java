package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.price = 13.0;
        drink1.alcohol = true;
        drink1.name = "Mojito";
        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "woda";
        ingredient1.volume = 100;
        drink1.ingredient1 = ingredient1;
        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "wódka";
        ingredient2.volume = 50;
        drink1.ingredient2 = ingredient2;
        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "sok cytrynowy";
        ingredient3.volume = 75;
        drink1.ingredient3 = ingredient3;
        int totalVolume = (ingredient1.volume + ingredient2.volume + ingredient3.volume);
        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena " + drink1.price + "zł");
        System.out.println("Czy zawiera alkohol ? " + drink1.alcohol);
        System.out.println("Składniki:");
        System.out.println(ingredient1);
        System.out.println(ingredient2);
        System.out.println(ingredient3);
        System.out.println("Pojemność: " + totalVolume + "ml");

    }
}
