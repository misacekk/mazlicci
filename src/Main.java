import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Mazlicek> seznam = new ArrayList<>();
        seznam.add(new Mazlicek("Pepa", "Jeseter", 2, 55));
        seznam.add(new Mazlicek("Ferdinand", "Kůň", 4, 21));

        boolean end = false;
        while (!end) {
            System.out.println("Menu");
            System.out.println("1 - Přidat mazlíčka");
            System.out.println("2 - Výpis všech mazlíčků");
            System.out.println("3 - Průměrný věk a váha");


            int volba = sc.nextInt();

            switch (volba) {
                case 1:
                    System.out.println("Zadej jméno");
                    String jmeno = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Zadej druh");
                    String druh = sc.nextLine();
                    System.out.println("Zadej věk");
                    int vek = sc.nextInt();
                    System.out.println("Zadej váhu");
                    int vaha = sc.nextInt();
                    sc.nextLine();
                    seznam.add(new Mazlicek(jmeno, druh, vek, vaha));
                    break;
                case 2:
                    System.out.println("Seznam");
                    for (Mazlicek m : seznam) {
                        System.out.println(m);
                    }
                    break;
                case 3:
                    System.out.println("Průměrný věk");
                    System.out.println(SpravaMazlicku.vypocetPrumernehoVeku(seznam));
                    System.out.println("Průměrná váha");
                    System.out.println(SpravaMazlicku.vypocetPrumerneVahy(seznam));
                    break;
                case 4:
                    System.out.println("Hledání podle jména");
                    break;
                case 5:
                    System.out.println("Filtrování podle druhu");
            }
        }

    }
}