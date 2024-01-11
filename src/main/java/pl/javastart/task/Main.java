package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.price = 13.0;
        drink1.alcohol = true;
        drink1.name = "Mojito";
        Ingridient ingridient1 = new Ingridient();
        ingridient1.name = "woda";
        ingridient1.volume = 100;
        Ingridient ingridient2 = new Ingridient();
        ingridient2.name = "wódka";
        ingridient2.volume = 50;
        Ingridient ingridient3 = new Ingridient();
        ingridient3.name = "sok cytrynowy";
        ingridient3.volume = 75;
        int totalVolume = (ingridient1.volume + ingridient2.volume + ingridient3.volume);
        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena " + drink1.price + "zł");
        System.out.println("Czy zawiera alkohol ? " + drink1.alcohol);
        System.out.println("Składniki:");
        System.out.println(ingridient1.name);
        System.out.println(ingridient2.name);
        System.out.println(ingridient3.name);
        System.out.println("Pojemność: " + totalVolume + "ml");
    }
}
